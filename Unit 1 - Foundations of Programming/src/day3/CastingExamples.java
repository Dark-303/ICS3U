package day3;

public class CastingExamples {
    public static void main(String[] args) {
        int x = 7;
        int y = 10;

        double a = 7.3;
        double b = 2.1;

        // casting is changing a type to another type temporarily
        int z = (int) 5.3; // casts 5.3 to an int. 5.3 is a double --> truncates to 5
        // int p = 5.3; // cannot assign a double to an int
        double c = 5; // Java changed the int 5 into a double first (implicit cast)

        // If java does the cast automatically it's implicit casting
        // If you do the cast using (int), (double), (String) or (type) it's explicit
        // casting

        int q = (int) 17.2; // needs an explicit cast
                            // Java will only do it if makes sense i.e. int 5 --> double 5.0

        int o = (int) 2.1; // more precision --> less precision
                           // double --> int
                           // narrowing conversion -- explicit cast

        double f = y; // less precision --> more precision
                      // int --> double
                      // widening conversion -- explicit or implict cast
    }
}