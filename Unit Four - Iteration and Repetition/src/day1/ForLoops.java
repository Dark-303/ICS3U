package day1;

public class ForLoops {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println(sum);
        }
        backwards("Hello");
        System.out.println(numOccurences("bana", "banana"));
    }

    public static void backwards(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.substring(i, i + 1));
        }
        System.out.println();
    }

    public static int numOccurences(String str1, String str2) {
        String big = str1;
        String small = str2;

        if (str1.length() < str2.length()) {
            big = str2;
            small = str1;
        }

        int result = 0;

        for (int i = 0; i < big.length() - small.length() + 1; i++) {
            String s = big.substring(i, i + small.length());
            if (s.equals(small)) {
                result++;
            }
        }

        return result;
    }
}
