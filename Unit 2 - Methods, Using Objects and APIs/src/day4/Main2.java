package day4;

public class Main2 {
    public static void main(String[] args) {
        /*
        * 1. Create a Weapon object called sword named "Iron Blade" with a power of 15.
        * 2. Create a Monster object called goblin with the type "Goblin" and 50
        * health.
        * 3. Create a Player object named "Zara" who is equipped with the sword.
        * 4. Print Zara's weapon information using the appropriate method.
        * 5. Have Zara attack the goblin once using her equipped weapon.
        * 6. Print the goblin's health status.
        * 7. Create another Weapon called bow named "Shadow Bow" with a power of 12.
        * 8. Create another Player named "Kai" equipped with the bow.
        * 9. Create a second Monster called slime with the type "Green Slime" and 40
        * health.
        * 10. Have Kai attack the slime once. Then print the slime's status and Kai’s
        * weapon information.
        * 
        */

        Weapon ironBlade = new Weapon("Iron Blade", 15);

        Monster goblin = new Monster("Goblin", 50);

        Player zara = new Player("Zara", ironBlade);

        System.out.println(zara.getWeaponInfo());

        zara.attack(goblin);

        System.out.println(goblin.getHealth());

        Weapon shadowBow = new Weapon("Shadow Bow", 12);

        Player kai = new Player("Kai", shadowBow);

        Monster slime = new Monster("Green Slime", 40);

        kai.attack(slime);
        System.out.println(slime.getStatus());
        System.out.println(kai.getWeaponInfo());
    } 
}
