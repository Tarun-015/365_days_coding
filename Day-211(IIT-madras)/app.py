from flask import Flask, render_template, request, redirect
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///week7_database.sqlite3'
db = SQLAlchemy(app)

class Student(db.Model):
    __tablename__ = 'student'
    student_id = db.Column(db.Integer, primary_key=True)
    roll_number = db.Column(db.String, unique=True, nullable=False)
    first_name = db.Column(db.String, nullable=False)
    last_name = db.Column(db.String)

class Course(db.Model):
    __tablename__ = 'course'
    course_id = db.Column(db.Integer, primary_key=True)
    course_code = db.Column(db.String, unique=True, nullable=False)
    course_name = db.Column(db.String, nullable=False)
    course_description = db.Column(db.String)

class Enrollment(db.Model):
    __tablename__ = 'enrollments'
    enrollment_id = db.Column(db.Integer, primary_key=True)
    estudent_id = db.Column(db.Integer, db.ForeignKey('student.student_id'), nullable=False)
    ecourse_id = db.Column(db.Integer, db.ForeignKey('course.course_id'), nullable=False)

@app.route('/')
def index():
    students = Student.query.all()
    return render_template('index.html', students=students)

@app.route('/student/create', methods=['GET','POST'])
def create_student():
    if request.method == 'POST':
        roll = request.form['roll']
        f = request.form['f_name']
        l = request.form['l_name']
        if Student.query.filter_by(roll_number=roll).first():
            return render_template('error.html', message="Student already exists")
        s = Student(roll_number=roll, first_name=f, last_name=l)
        db.session.add(s)
        db.session.commit()
        return redirect('/')
    return render_template('create_student.html')

@app.route('/student/<int:id>')
def student_detail(id):
    student = Student.query.get(id)
    enrollments = Enrollment.query.filter_by(estudent_id=id).all()
    courses = [Course.query.get(e.ecourse_id) for e in enrollments]
    return render_template('student_detail.html', student=student, courses=courses)

@app.route('/student/<int:id>/update', methods=['GET','POST'])
def update_student(id):
    student = Student.query.get(id)
    if request.method == 'POST':
        student.first_name = request.form['f_name']
        student.last_name = request.form['l_name']
        course_id = request.form.get('course')
        if course_id:
            db.session.add(Enrollment(estudent_id=id, ecourse_id=course_id))
        db.session.commit()
        return redirect('/')
    courses = Course.query.all()
    return render_template('update_student.html', student=student, courses=courses)

@app.route('/student/<int:id>/delete')
def delete_student(id):
    Enrollment.query.filter_by(estudent_id=id).delete()
    Student.query.filter_by(student_id=id).delete()
    db.session.commit()
    return redirect('/')

@app.route('/student/<int:id>/withdraw/<int:course_id>')
def withdraw(id, course_id):
    Enrollment.query.filter_by(estudent_id=id, ecourse_id=course_id).delete()
    db.session.commit()
    return redirect('/')

@app.route('/courses')
def courses():
    courses = Course.query.all()
    return render_template('courses.html', courses=courses)

@app.route('/course/create', methods=['GET','POST'])
def create_course():
    if request.method == 'POST':
        code = request.form['code']
        name = request.form['c_name']
        desc = request.form['desc']
        if Course.query.filter_by(course_code=code).first():
            return render_template('error.html', message="Course already exists")
        c = Course(course_code=code, course_name=name, course_description=desc)
        db.session.add(c)
        db.session.commit()
        return redirect('/courses')
    return render_template('create_course.html')

@app.route('/course/<int:id>')
def course_detail(id):
    course = Course.query.get(id)
    enrollments = Enrollment.query.filter_by(ecourse_id=id).all()
    students = [Student.query.get(e.estudent_id) for e in enrollments]
    return render_template('course_detail.html', course=course, students=students)

@app.route('/course/<int:id>/update', methods=['GET','POST'])
def update_course(id):
    course = Course.query.get(id)
    if request.method == 'POST':
        course.course_name = request.form['c_name']
        course.course_description = request.form['desc']
        db.session.commit()
        return redirect('/courses')
    return render_template('update_course.html', course=course)

@app.route('/course/<int:id>/delete')
def delete_course(id):
    Enrollment.query.filter_by(ecourse_id=id).delete()
    Course.query.filter_by(course_id=id).delete()
    db.session.commit()
    return redirect('/')

if __name__ == "__main__":
    app.run(debug=True)
