package day1;

import day2.Car;

public class Game {
    public static void main(String[] args) {
        Die die1 = new Die(11);
        Die die2 = new Die(11);
        Die die3 = new Die(11);

        int dieScore = 0;
        int diesScore = 0;
        int ties = 0;

        for (int i = 0; i < 1000000; i++) {
            if(die1.compareTo(die2) == 0) ties++;
            else if(die1.compareTo(die2) > 0) dieScore++;
            else diesScore++;
            if(die1.compareTo(die3) == 0) ties++;
            else if(die1.compareTo(die3) > 0) dieScore++;
            else diesScore++;
        }
        System.out.println("die score: " + dieScore + " || dies score: " + diesScore + " || ties: " + ties);

        ILoveClasses math = new ILoveClasses();
        System.out.println(math.calculateUnknownNExponent(0.55, 0.5, 0, 10));

        Car car = new Car("?", "?", 0, 0);
        car.drive(1);
        car.displayCarDetails();
    }
}
