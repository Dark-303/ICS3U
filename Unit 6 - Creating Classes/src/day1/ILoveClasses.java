package day1;

public class ILoveClasses {
    private int totalTimes;
    private String id;

    public ILoveClasses() {
        id = Integer.toHexString(hashCode());
        totalTimes = 0;
    }

    public void changeTimes() {
        totalTimes++;
    }

    public void addTimes(int times) {
        totalTimes += times;
    }

    public void printILoveClasses() {
        System.out.println("I Love Classes");
        changeTimes();
    }

    public void printFor(int numTimes) {
        int i;
        for (i = 0; i < numTimes; i++) {
            printILoveClasses();
        }
        System.out.println("You printed I Love Classes " + i + 1);
        changeTimes();
    }

    public double calculateUnknownNExponent(double known, double base, double min, double max) {
        double precision = Math.pow(10, -20);
        boolean lessThan1 = base < 1;
        double mid = 0;
        while (max - min > precision) {
            mid = (min + max) / 2.0;
            double result = Math.pow(base, mid);
            if (Math.abs(result - known) < precision) {
                    break;
            } else if (lessThan1) {
                if (result > known) {
                    min = mid;
                } else {
                    max = mid;
                }
            } else {
                if (result < known) {
                    min = mid;
                } else {
                    max = mid;
                }
            }
        }
        return mid;
    }

    public void simulatePrints(int numTimes) {
        System.out.println("You printed I Love Classes " + numTimes);
        addTimes(numTimes);
    }

    public int getTimes() {
        return totalTimes;
    }

    public void printTimes() {
        System.out.println("Total Times Printed: " + totalTimes);
    }

    public String toString() {
        return "ID : " + id + " || Total Times Printed : " + totalTimes;
    }
}
