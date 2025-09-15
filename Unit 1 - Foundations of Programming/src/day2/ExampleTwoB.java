package day2;

public class ExampleTwoB {
    public static void main(String[] args) {
        // int and double are primitice types
        int numApples = 7; // cammelCase 
        System.out.println(numApples);
        numApples = 10;
        System.out.println(numApples);

        final int numBananas = 5; // constant
        // numBananas = 8; // error: cannot change a constant
        
        final int numStudents;
        numStudents = 24;
        // numStudents = 30; // Can only initialize once
    }
}
