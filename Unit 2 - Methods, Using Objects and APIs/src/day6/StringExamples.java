package day6;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = "hello";
        String s4 = "hello";

        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // true

        System.out.println(s1.equals(s2)); // this.methodName(parameters)

        System.out.println(s1.length()); // 5
        // Largest index is length - 1

        String s5 = "ell";
        String s6 = "E";

        System.out.println(s1.indexOf(s2));
        System.out.println(s1.indexOf(s5)); // 1
        System.out.println(s1.indexOf(s6)); // -1

        System.out.println("banana".indexOf("an")); // 'h'
        System.out.println("an".indexOf("banana")); // 3

        System.out.println("alphabet soup".length()); // 13
        System.out.println("alphabet soup".substring(5, 8)); // bet

        System.out.println(s1.substring(4)); // o
        System.out.println(s1.substring(4,5)); // o

        String mystery = "The Beast of Possibility: RX-0 Unicorn Gundam. The Better Beast of Possibility: RX-0 Unicorn Gundam Full Perfectibility Armor Plan B";
        System.out.println(mystery.substring(mystery.length()-1,mystery.length())); // B
        System.out.println(mystery.substring(mystery.length()-1)); // B

        System.out.println("alphabet soup".substring(9)); // T

        System.out.println(mystery.length());
    }
}
