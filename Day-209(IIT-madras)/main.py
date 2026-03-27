from flask import Flask
from flask_restful import Api, Resource, reqparse, fields, marshal_with
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///database.sqlite3'
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False

db = SQLAlchemy(app)
api = Api(app)

# ─── Models ───────────────────────────────────────────────────────────────────

class Course(db.Model):
    __tablename__ = 'course'
    course_id = db.Column(db.Integer, primary_key=True, autoincrement=True)
    course_name = db.Column(db.String, nullable=False)
    course_code = db.Column(db.String, unique=True, nullable=False)
    course_description = db.Column(db.String)

class Student(db.Model):
    __tablename__ = 'student'
    student_id = db.Column(db.Integer, primary_key=True, autoincrement=True)
    roll_number = db.Column(db.String, unique=True, nullable=False)
    first_name = db.Column(db.String, nullable=False)
    last_name = db.Column(db.String)

class Enrollment(db.Model):
    __tablename__ = 'enrollment'
    enrollment_id = db.Column(db.Integer, primary_key=True, autoincrement=True)
    student_id = db.Column(db.Integer, db.ForeignKey('student.student_id'), nullable=False)
    course_id = db.Column(db.Integer, db.ForeignKey('course.course_id'), nullable=False)

with app.app_context():
    db.create_all()

# ─── Output fields ────────────────────────────────────────────────────────────

course_fields = {
    'course_id': fields.Integer,
    'course_name': fields.String,
    'course_code': fields.String,
    'course_description': fields.String,
}

student_fields = {
    'student_id': fields.Integer,
    'roll_number': fields.String,
    'first_name': fields.String,
    'last_name': fields.String,
}

enrollment_fields = {
    'enrollment_id': fields.Integer,
    'student_id': fields.Integer,
    'course_id': fields.Integer,
}

# ─── Parsers ──────────────────────────────────────────────────────────────────

course_parser = reqparse.RequestParser()
course_parser.add_argument('course_name')
course_parser.add_argument('course_code')
course_parser.add_argument('course_description')

student_parser = reqparse.RequestParser()
student_parser.add_argument('roll_number')
student_parser.add_argument('first_name')
student_parser.add_argument('last_name')

enrollment_parser = reqparse.RequestParser()
enrollment_parser.add_argument('course_id', type=int)

# ─── Error helper ─────────────────────────────────────────────────────────────

def error_response(status_code, error_code, error_message):
    return {'error_code': error_code, 'error_message': error_message}, status_code

# ─── Course Resource ──────────────────────────────────────────────────────────

class CourseResource(Resource):
    @marshal_with(course_fields)
    def get(self, course_id):
        course = Course.query.get(course_id)
        if course is None:
            return error_response(404, 'COURSE001', 'Course not found')
        return course

    @marshal_with(course_fields)
    def put(self, course_id):
        course = Course.query.get(course_id)
        if course is None:
            return error_response(404, 'COURSE001', 'Course not found')
        args = course_parser.parse_args()
        course_name = args.get('course_name')
        course_code = args.get('course_code')
        course_description = args.get('course_description')

        if not course_name:
            return error_response(400, 'COURSE001', 'Course Name is required')
        if not course_code:
            return error_response(400, 'COURSE002', 'Course Code is required')

        course.course_name = course_name
        course.course_code = course_code
        course.course_description = course_description
        db.session.commit()
        return course, 200

    def delete(self, course_id):
        course = Course.query.get(course_id)
        if course is None:
            return error_response(404, 'COURSE001', 'Course not found')
        db.session.delete(course)
        db.session.commit()
        return {'message': 'Course deleted successfully'}, 200


class CourseListResource(Resource):
    @marshal_with(course_fields)
    def post(self):
        args = course_parser.parse_args()
        course_name = args.get('course_name')
        course_code = args.get('course_code')
        course_description = args.get('course_description')

        if not course_name:
            return error_response(400, 'COURSE001', 'Course Name is required')
        if not course_code:
            return error_response(400, 'COURSE002', 'Course Code is required')

        existing = Course.query.filter_by(course_code=course_code).first()
        if existing:
            return error_response(409, 'COURSE002', 'course_code already exist')

        course = Course(
            course_name=course_name,
            course_code=course_code,
            course_description=course_description
        )
        db.session.add(course)
        db.session.commit()
        return course, 201

# ─── Student Resource ─────────────────────────────────────────────────────────

class StudentResource(Resource):
    @marshal_with(student_fields)
    def get(self, student_id):
        student = Student.query.get(student_id)
        if student is None:
            return error_response(404, 'STUDENT001', 'Student not found')
        return student

    @marshal_with(student_fields)
    def put(self, student_id):
        student = Student.query.get(student_id)
        if student is None:
            return error_response(404, 'STUDENT001', 'Student not found')
        args = student_parser.parse_args()
        roll_number = args.get('roll_number')
        first_name = args.get('first_name')
        last_name = args.get('last_name')

        if not roll_number:
            return error_response(400, 'STUDENT001', 'Roll Number required')
        if not first_name:
            return error_response(400, 'STUDENT002', 'First Name is required')

        student.roll_number = roll_number
        student.first_name = first_name
        student.last_name = last_name
        db.session.commit()
        return student, 200

    def delete(self, student_id):
        student = Student.query.get(student_id)
        if student is None:
            return error_response(404, 'STUDENT001', 'Student not found')
        db.session.delete(student)
        db.session.commit()
        return {'message': 'Student deleted successfully'}, 200


class StudentListResource(Resource):
    @marshal_with(student_fields)
    def post(self):
        args = student_parser.parse_args()
        roll_number = args.get('roll_number')
        first_name = args.get('first_name')
        last_name = args.get('last_name')

        if not roll_number:
            return error_response(400, 'STUDENT001', 'Roll Number required')
        if not first_name:
            return error_response(400, 'STUDENT002', 'First Name is required')

        existing = Student.query.filter_by(roll_number=roll_number).first()
        if existing:
            return error_response(409, 'STUDENT001', 'roll_number already exist')

        student = Student(
            roll_number=roll_number,
            first_name=first_name,
            last_name=last_name
        )
        db.session.add(student)
        db.session.commit()
        return student, 201

# ─── Enrollment Resource ──────────────────────────────────────────────────────

class EnrollmentResource(Resource):
    @marshal_with(enrollment_fields)
    def get(self, student_id):
        student = Student.query.get(student_id)
        if student is None:
            return error_response(404, 'ENROLLMENT002', 'Student does not exist.')
        enrollments = Enrollment.query.filter_by(student_id=student_id).all()
        if not enrollments:
            return error_response(404, 'ENROLLMENT001', 'Course does not exist')
        return enrollments, 200

    @marshal_with(enrollment_fields)
    def post(self, student_id):
        student = Student.query.get(student_id)
        if student is None:
            return error_response(404, 'ENROLLMENT002', 'Student does not exist.')

        args = enrollment_parser.parse_args()
        course_id = args.get('course_id')

        course = Course.query.get(course_id)
        if course is None:
            return error_response(404, 'ENROLLMENT001', 'Course does not exist')

        enrollment = Enrollment(student_id=student_id, course_id=course_id)
        db.session.add(enrollment)
        db.session.commit()
        return enrollment, 201


class EnrollmentDeleteResource(Resource):
    def delete(self, student_id, course_id):
        student = Student.query.get(student_id)
        if student is None:
            return error_response(404, 'ENROLLMENT002', 'Student does not exist.')

        course = Course.query.get(course_id)
        if course is None:
            return error_response(404, 'ENROLLMENT001', 'Course does not exist')

        enrollment = Enrollment.query.filter_by(
            student_id=student_id, course_id=course_id
        ).first()
        if enrollment is None:
            return error_response(404, 'ENROLLMENT001', 'Enrollment not found')

        db.session.delete(enrollment)
        db.session.commit()
        return {'message': 'Enrollment deleted successfully'}, 200

# ─── Routes ───────────────────────────────────────────────────────────────────

api.add_resource(CourseResource, '/api/course/<int:course_id>')
api.add_resource(CourseListResource, '/api/course')

api.add_resource(StudentResource, '/api/student/<int:student_id>')
api.add_resource(StudentListResource, '/api/student')

api.add_resource(EnrollmentResource, '/api/student/<int:student_id>/course')
api.add_resource(EnrollmentDeleteResource, '/api/student/<int:student_id>/course/<int:course_id>')

if __name__ == '__main__':
    app.run(debug=True)
