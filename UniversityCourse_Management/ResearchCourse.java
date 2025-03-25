package java_generics.UniversityCourse_Management;

public class ResearchCourse extends CourseType{
    public ResearchCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + "is evaluated through research paper");
    }
}
