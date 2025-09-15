package day2;

public class ExampleFourB {
    public static void main(String[] args) {
        int num = 4736;
        int digit4 = num % 10; // 6
        int digit3 = (num / 10) % 10; // 3
        int digit2 = (num / 100) % 10; // 7
        int digit1 = (num / 1000) % 10; // 4
        System.out.println(digit1 + digit2 + digit3 + digit4);
    }
}
