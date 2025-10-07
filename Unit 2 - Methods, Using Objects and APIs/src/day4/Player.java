package day4;

public class Player {
    private String name;
    private Weapon equippedWeapon;

    public Player(String name, Weapon weapon) {
        this.name = name;
        this.equippedWeapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void attack(Monster monster) {
        monster.reduceHealth(equippedWeapon.getPower());
    }

    public String getWeaponInfo() {
        return equippedWeapon.getInfo();
    }
}