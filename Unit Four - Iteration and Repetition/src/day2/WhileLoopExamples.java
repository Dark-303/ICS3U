package day2;

public class WhileLoopExamples {
    public static void main(String[] args) {
        exampleOne();
        exampleTwo();
        exampleThree();
        exampleFour();
    }

    private static void exampleFour() {
        for (boolean gameOver = false; !gameOver;) {
            System.out.println("Playing the game");
            
            if ((int)(Math.random() * 100) + 1 == 23) {
                gameOver = true;
                System.out.println("You fell and hurt your feelings! Game Over!");
            }
        }
    }

    private static void exampleThree() {
        boolean gameOver = false;

        while (!gameOver) {
            System.out.println("Playing the game");

            if ((int) (Math.random() * 100) + 1 == 23) {
                gameOver = true;
                System.out.println("You fell and hurt your feelings! Game Over!");
            }
        }
    }

    private static void exampleTwo() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    private static void exampleOne() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
