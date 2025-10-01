package day3;

public class Main1 {
    public static void main(String[] args) {
        // Create teacher Mr. Smith
        Teacher mrSmith = new Teacher ("Mr. Smith", "Math", 10);
        
        // Create students John and Jane
        Student john = new Student("John", 85, 95.0);
        Student jane = new Student("Jane", 90, 98.0);

        // Create course Algebra
        Course mathCourse = new Course("Algebra", mrSmith);

        // Add students to course
        mathCourse.addStudent(john);
        mathCourse.addStudent(jane);
        
        // Start course
        mathCourse.startClass();

        // Assign grades
        mrSmith.assignGrade(john, 85);
        mrSmith.assignGrade(jane, 90);

        // Check attendence
        john.attendClass();
        jane.attendClass();

        // Print course roster
        mathCourse.printCourseRoster();
        
        // Check if student can graduate
        System.out.println(john.graduate());
        System.out.println(jane.graduate());
    }
}
