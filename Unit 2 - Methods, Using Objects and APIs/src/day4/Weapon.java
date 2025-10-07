package day4;

public class Weapon {
    private String name;
    private int power;

    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public String getInfo() {
        return name + " (Power: " + power + ")";
    }
}
