package day2;

public class Test {
    public void question() {
        /*
         * In the math department the teachers played a game to see who would be lucky
         * enough to stay after school on Friday and monitor anybody who had to take a
         * test. Each teacher thought of a number between 1 and 10, tripled it,
         * subtracted it from 33, and then multiplied it by the number they originally
         * chose. The person with the highest number won.
         */
        for (double i = 1; i <= 10; i += 0.5) {
            System.out.println(i * (33 - 3 * i));
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a test file.");
        Test t = new Test();
        t.question();
    }
}
