package day5;

public class MathExamples {
    public static void main(String[] args) {
        // Math m = new Math(); // Cannot instantiate Math class

        System.out.println(Math.PI);

        System.out.println(Math.abs(-7));
        System.out.println(Math.abs(-9.4));

        System.out.println(Math.sqrt(2));
        System.out.println(Math.sqrt(9));

        System.out.println(Math.pow(5, 3));
        System.out.println(Math.pow(2, 0.5));

        int x1 = -1, y1 = 3;
        int x2 = 3, y2 = 7;
        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length: " + length);
    }
}
