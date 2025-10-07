package day4;

public class Item {
    private String itemName;
    private int healAmount;

    public Item(String itemName, int healAmount) {
        this.itemName = itemName;
        this.healAmount = healAmount;
    }

    public String getItemName() {
        return itemName;
    }

    public int getHealAmount() {
        return healAmount;
    }

    public String getInfo() {
        return itemName + " restores " + healAmount + " HP.";
    }
}
