package day3;

public class Student {
    // Private instance variables
    private String name;
    private int grade;
    private double attendancePercentage;

    // Constructor
    public Student(String name, int grade, double attendancePercentage) {
        this.name = name;
        this.grade = grade;
        this.attendancePercentage = attendancePercentage;
    }

    // Public method to mark attendance
    public void attendClass() {
        // logic to increase attendance can go here
    }

    // Public method to get the average grade
    public double getAverage() {
        return 0.0;
    }

    // Public method to check if the student can graduate
    public boolean graduate() {
        return false;
    }
}