package day2;

public class ExampleThreeB {
    public static void main(String[] args) {
        int x = 7, y = 2;
        double a = 7.0, b = 2;
        System.out.println(x + y); // 9 int + int = int
        System.out.println(x + a); // 14.0 int + double = double
        System.out.println(a + b); // 9.0 double + double = double
        System.out.println();
        System.out.println(x / y); // 7 / 2 = 3 int / int = int
        System.out.println(a / b); // 7.0 / 2.0 = 3.5 double / double = double
        System.out.println(a / y); // 7.0 / 2 = 3.5 double / int = double
        System.out.println(x % y); // 7 % 2 = 1 int % int = int
    }
}
