package day4;

public class Pokemon {
    private String name;
    private int level;
    private int health;

    public Pokemon(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public void heal(int amount) {
        health += amount;
    }

    public String getStatus() {
        return name + " (Level " + level + ") has " + health + " HP.";
    }
}
