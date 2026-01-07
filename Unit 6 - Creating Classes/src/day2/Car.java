package day2;

public class Car {
    private String make;
    private String model;
    private int year;
    private double mileage;

    public Car(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;

        /*
         * setMake(make);
         * setModel(model);
         * setYear(year);
         * setMileage(mileage);
         */
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + year + ", mileage=" + mileage + "]";
    }

    public void displayCarDetails() {
        System.out.print("Make : " + make);
        System.out.print(" || ");
        System.out.print("Model : " + model);
        System.out.print(" || ");
        System.out.print("Year : " + year);
        System.out.print(" || ");
        System.out.print("Mileage : " + mileage);
        System.out.println();
    }

    public void displayToString() {
        System.out.println(this);
    }

    public void drive(double milesDriven) {
        // mileage += milesDriven;
        // System.out.println("Mileage : " + mileage);
        System.out.println(mileage += milesDriven);
    }
}