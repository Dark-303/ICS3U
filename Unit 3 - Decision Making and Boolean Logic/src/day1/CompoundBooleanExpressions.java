package day1;

public class CompoundBooleanExpressions {
    public static void main(String[] args) {
        boolean hasBrownHair = false;
        boolean hasWhiteShoes = true;

        System.out.println(hasBrownHair && hasWhiteShoes); // false
        // When using AND (&&) both expressions must be true for the whole expression to be true

        // || means OR
        System.out.println(hasBrownHair || hasWhiteShoes); // true -> needs one or the other
    }
}
