package day2;

public class ExampleFiveB {
    public static void main(String[] args) {
        int mark1 = 80, mark2 = 96, mark3 = 67, mark4 = 82;
        int numMarks = 4;
        double average = (mark1 + mark2 + mark3 + mark4) / (double)numMarks; // (double) cast int to double
        System.out.println("Average: " + average);
    }
}
