package day7;

public class ComparingExamples {
    public static void main(String[] args) {
        // Using the equals method - checks the sequence of characters
        // String s1 = "Hello";
        // String s2 = new String("Hello");

        // System.out.println(s1.equals(s2)); // true
        // System.out.println(s1 == s2); // false

        String s3 = "goodbye";
        String s4 = "hello";
        String s5 = "alphabet";
        String s6 = "goose";

        System.out.println(s3.compareTo(s4));
        System.out.println(s4.compareTo(s3));
        System.out.println(s3.compareTo(s5));
        System.out.println(s4.compareTo(s5));

        // s5 < s3 < s6 < s4

        System.out.println(s3.compareTo(s6));
    }
}
