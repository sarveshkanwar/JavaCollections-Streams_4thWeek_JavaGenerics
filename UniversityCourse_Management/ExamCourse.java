package java_generics.UniversityCourse_Management;

public class ExamCourse extends CourseType{
    public ExamCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated through exams");
    }
}
