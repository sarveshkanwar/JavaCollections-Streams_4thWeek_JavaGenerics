package java_generics.UniversityCourse_Management;

abstract public class CourseType {
    String courseName;
    String department;

    public CourseType(String courseName, String department) {
        this.courseName = courseName;
        this.department = department;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDuration() {
        return department;
    }

    abstract public void evaluate();

    @Override
    public String toString() {
        return "CourseType{" +
                "courseName='" + courseName + '\'' +
                ", department=" + department +
                '}';
    }
}
