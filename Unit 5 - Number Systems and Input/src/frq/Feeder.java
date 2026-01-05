package frq;

public class Feeder {
    public static void main(String[] args) {
        Feeder feeder = new Feeder();
        feeder.refillFood(100);
        feeder.simulateOneDayConsole(5);
        feeder.refillFood(1000);
        feeder.simulateManyDaysConsole(5, 10);
    }

    private int currentFood = 0;

    public void simulateOneDay(int numBirds) {
        boolean normal = Math.random() < 0.95;
        if (!normal) {
            currentFood = 0;
        } else {
            int eaten = ((int)Math.random()*41) + 10;
            int amountEaten = numBirds*eaten;
            currentFood -= amountEaten;
            if (currentFood < 0) currentFood = 0;
        }
    }

    public int simulateManyDays(int numBirds, int numDays) {
        int result = 0;
        for (int i = 0; i < numDays && currentFood > 0; i++) {
            simulateOneDay(numBirds);
            result++;
        }

        return result;
    }

    public void refillFood(int food) {
        currentFood += food;
    }

    public void simulateOneDayConsole(int numBirds) {
        boolean normal = Math.random() < 0.95;
        if (!normal) {
            System.out.println("A bear attacked!");
            currentFood = 0;
        } else {
            int eaten = ((int)Math.random()*41) + 10;
            int amountEaten = numBirds*eaten;
            System.out.println(amountEaten + " food was eaten");
            currentFood -= amountEaten;
            if (currentFood < 0) currentFood = 0;
            System.out.println(currentFood + " food is left");
        }
    }

    public void simulateManyDaysConsole(int numBirds, int numDays) {
        int result = 0;
        for (int i = 0; i < numDays && currentFood > 0; i++) {
            simulateOneDayConsole(numBirds);
            result++;
        }

        System.out.println(result);
    }
}