package day2;

public class Homework {
    public void question1() {
        System.out.println("Question 1:");
        /*
         * You want to calculate the total cost of purchasing 3 items,
         * each priced at $15.95. Would you use int or double for the
         * variables representing the item price and the total cost?
         * Calculate the total cost and print it.
         */
        // You would use a double as money is represented using floating point numbers.
        double itemPrice = 15.95;
        int quantity = 3;
        double totalCost = itemPrice * quantity;
        System.out.println("Total cost: $" + totalCost);
        System.out.println();
    }

    public void question2() {
        System.out.println("Question 2:");
        /*
         * You need to find the area of a rectangle with a length of
         * 8.5 meters and a width of 6 meters. Should you use int or
         * double for the variables representing the length, width,
         * and area? Calculate the area and print it.
         */

        // You would use a double for the length as it is a floating point number, and
        // an int for width and area. However, the area can also be a double for more
        // precision.

        double length = 8.5, areaDouble; // Second area variable to show double usage
        int width = 6, area;
        area = (int) (length * width); // Casting to int as area is expected to be an integer
        System.out.println("Area of the rectangle: " + area + " square meters");
        areaDouble = length * width;
        System.out.println("Area of the rectangle (as double): " + areaDouble + " square meters");
        System.out.println();
    }

    public void question3() {
        System.out.println("Question 3:");
        /*
         * You're calculating the average score of a student who took 5 exams.
         * Should you use int or double for the variables representing the
         * exam scores and the average score? Calculate the average score and print it.
         */
        // You would use a double for both exam scores and average score for precision.
        double totalScore = 100 + 90.5 + 87.5 + 95 + 81.5;
        int numberOfExams = 5;
        double averageScore = totalScore / numberOfExams;
        System.out.println("Average score: " + averageScore);
        System.out.println();
    }

    public void question4() {
        System.out.println("Question 4:");
        /*
         * You have a number, 137, and you want to extract its tens digit (3)
         * using the modulo operator. Would you use int or double for the variable
         * representing the original number and the tens digit? Calculate the
         * tens digit and print it.
         */
        // You would use an int for both the original number and the tens digit as they
        // are whole numbers.
        int num = 137;
        int tensDigit = (num / 10) % 10; // Extracting the tens digit
        System.out.println("Tens digit: " + tensDigit);
        System.out.println();
    }

    public void question5() {
        System.out.println("Question 5:");
        /*
         * You want to divide 10 by 3 and find the remainder. Would you use int
         * or double for the variables representing the dividend, divisor, and
         * remainder? Calculate the remainder and print it.
         */
        // You would use int for all three variables as they are whole numbers.
        int dividend = 10;
        int divisor = 3;
        int remainder = dividend % divisor; // Calculating the remainder
        System.out.println("Remainder of 10 divided by 3: " + remainder);
        System.out.println();
    }

    public void question6() {
        System.out.println("Question 6:");
        /*
         * You have a circle with a radius of 4.7 meters, and you want to calculate
         * its circumference. Should you use int or double for the variables
         * representing the radius and circumference? Calculate the circumference and
         * print it.
         */
        // You would use a double for both radius and circumference as they are floating
        // point numbers and for precision.
        double radius = 4.7;
        double circumference = 2 * Math.PI * radius; // Calculating the circumference
        System.out.println("Circumference of the circle: " + circumference + " meters");
        System.out.println();
    }

    public void question7() {
        System.out.println("Question 7:");
        /*
         * You need to calculate the total cost of buying 4 movie tickets, each priced
         * at $12.50, including a 15% service fee. Would you use int or double for the
         * variables representing the ticket price, service fee, and total cost?
         * Calculate the total cost and print it.
         */
        // You would use a double for all three variables as they involve money and
        // precentages.
        double ticketPrice = 12.50;
        int numberOfTickets = 4;
        double serviceFeeRate = 0.15;
        double subtotal = ticketPrice * numberOfTickets;
        double serviceFee = subtotal * serviceFeeRate;
        double totalCost = subtotal + serviceFee;
        System.out.println("Total cost of movie tickets including service fee: $" + totalCost + ". The subtotal was $"
                + subtotal + " and the service fee was $" + serviceFee + ".");
        System.out.println();
    }

    public void question8() {
        System.out.println("Question 8:");
        /*
         * You have a 3-digit number, 456, and you want to extract its units digit (6)
         * using the modulo operator. Would you use int or double for the variable
         * representing the original number and the units digit? Calculate the units
         * digit and print it.
         */
        // You would use an int for both the original number and the units digit as they
        // are whole numbers.
        int num = 456;
        int unitsDigit = num % 10; // Extracting the units digit
        System.out.println("Units digit: " + unitsDigit);
        System.out.println();
    }

    public void question9() {
        System.out.println("Question 9:");
        /*
         * You want to calculate the area of a triangle with a base of 9.8 meters and a
         * height of 5.2 meters. Should you use int or double for the variables
         * representing the base, height, and area? Calculate the area and print it.
         */
        // You would use a double for all three variables as they are floating point
        // numbers.
        double base = 9.8;
        double height = 5.2;
        double area = (base * height) / 2; // Calculating the area
        System.out.println("Area of the triangle: " + area + " square meters");
        System.out.println();
    }

    public void question10() {
        System.out.println("Question 10:");
        /*
         * You need to determine if a number, 183, is divisible by 7 using the modulo
         * operator. Would you use int or double for the variable representing the
         * original number and the result of the modulo operation? Calculate the result
         * and print whether it's divisible by 7.
         */
        // You would use an int for both the original number and the result of the
        // modulo operator as they are whole numbers.
        int num = 183;
        int result = num % 7; // Calculating the result of the modulo operation
        if (result == 0) {
            System.out.println(num + " is divisible by 7.");
        } else {
            System.out.println(num + " is not divisible by 7. The remainder is " + result + ".");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Homework hw = new Homework();
        // Run each question method to see the answers
        hw.question1();
        hw.question2();
        hw.question3();
        hw.question4();
        hw.question5();
        hw.question6();
        hw.question7();
        hw.question8();
        hw.question9();
        hw.question10();
    }
}
