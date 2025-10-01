package day3;

public class Course {
    public class Course {
    // Private instance variables
    private String courseName;
    private Teacher teacher;
    private Student[] studentList;

    // Constructor
    public Course(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.studentList = new Student[30]; // default size, can be adjusted
    }

    // Public method to add a student to the course
    public void addStudent(Student student) {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = student;
                break;
            }
        }
    }

    // Public method to start a class
    public void startClass() {
        System.out.println("Class " + courseName + " has started, taught by " + teacher);
    }

    // Public method to print the course roster
    public void printCourseRoster() {
        System.out.println("Course: " + courseName);
        System.out.println("Teacher: " + teacher);
        System.out.println("Students enrolled:");
        for (Student s : studentList) {
            if (s != null) {
                System.out.println(" - " + s);
            }
        }
    }
}

}
