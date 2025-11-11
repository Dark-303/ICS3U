package day1;

public class BooleanExpressions {
    public static void main(String[] args) {
        boolean isGreen = false;
        System.out.println(isGreen);

        boolean isEqual = 7 == 3;
        System.out.println(isEqual);

        boolean isNotEqual = 7 != 3;
        System.out.println(isNotEqual);

        boolean hasRedShoes = true;
        System.out.println(!hasRedShoes);
        System.out.println(!!hasRedShoes);

        String str1 = "hello";
        String str2 = "goodbye";
        System.out.println(str1.equals(str2));
        System.out.println(!str1.equals(str2));

        System.out.println((5 >= 3));
        System.out.println(7 > 2);
        System.out.println(7 <= 2);
        System.out.println(4 < 9);
        System.out.println(2>2);
    }
}
