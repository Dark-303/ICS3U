package day1;

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
    }
}
