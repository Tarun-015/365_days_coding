
from flask import Flask, render_template, request, redirect, url_for
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///database.sqlite3'
db = SQLAlchemy(app)

class Student(db.Model):
    __tablename__ = 'student'
    student_id = db.Column(db.Integer, primary_key=True, autoincrement=True)
    roll_number = db.Column(db.String, unique=True, nullable=False)
    first_name = db.Column(db.String, nullable=False)
    last_name = db.Column(db.String)

class Course(db.Model):
    __tablename__ = 'course'
    course_id = db.Column(db.Integer, primary_key=True, autoincrement=True)
    course_code = db.Column(db.String, unique=True, nullable=False)
    course_name = db.Column(db.String, nullable=False)
    course_description = db.Column(db.String)

class Enrollment(db.Model):
    __tablename__ = 'enrollments'
    enrollment_id = db.Column(db.Integer, primary_key=True, autoincrement=True)
    estudent_id = db.Column(db.Integer, db.ForeignKey('student.student_id'), nullable=False)
    ecourse_id = db.Column(db.Integer, db.ForeignKey('course.course_id'), nullable=False)

@app.route('/')
def home():
    students = Student.query.all()
    return render_template("index.html", students=students)

@app.route('/student/create', methods=['GET','POST'])
def create():
    if request.method == 'POST':
        roll = request.form['roll']
        if Student.query.filter_by(roll_number=roll).first():
            return render_template("exists.html")
        s = Student(roll_number=roll, first_name=request.form['f_name'], last_name=request.form['l_name'])
        db.session.add(s)
        db.session.commit()
        courses = request.form.getlist('courses')
        for c in courses:
            cid = int(c.split('_')[1])
            db.session.add(Enrollment(estudent_id=s.student_id, ecourse_id=cid))
        db.session.commit()
        return redirect(url_for('home'))
    return render_template("create.html")

@app.route('/student/<int:id>')
def view(id):
    s = Student.query.get(id)
    enrolls = Enrollment.query.filter_by(estudent_id=id).all()
    courses = [Course.query.get(e.ecourse_id) for e in enrolls]
    return render_template("view.html", s=s, courses=courses)

@app.route('/student/<int:id>/update', methods=['GET','POST'])
def update(id):
    s = Student.query.get(id)
    if request.method == 'POST':
        s.first_name = request.form['f_name']
        s.last_name = request.form['l_name']
        Enrollment.query.filter_by(estudent_id=id).delete()
        for c in request.form.getlist('courses'):
            cid = int(c.split('_')[1])
            db.session.add(Enrollment(estudent_id=id, ecourse_id=cid))
        db.session.commit()
        return redirect(url_for('home'))
    return render_template("update.html", s=s)

@app.route('/student/<int:id>/delete')
def delete(id):
    Enrollment.query.filter_by(estudent_id=id).delete()
    Student.query.filter_by(student_id=id).delete()
    db.session.commit()
    return redirect(url_for('home'))

if __name__ == '__main__':
    app.run(debug=True)
