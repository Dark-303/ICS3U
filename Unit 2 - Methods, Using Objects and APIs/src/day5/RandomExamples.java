package day5;

public class RandomExamples {
    public static void main(String[] args) {
        // Random r = new Random(); // Need to import java.util.Random
        // System.out.println(r.nextInt(10)); // 0 to 9
        // System.out.println(r.nextInt(10) + 1); // 1 to 10
        // System.out.println(r.nextInt(6) + 1); // 1 to 6

        System.out.println(Math.random()); // 0.0 to 0.999999...
        System.out.println((int)(Math.random() * 10)); // 0 to 9
    }
}
