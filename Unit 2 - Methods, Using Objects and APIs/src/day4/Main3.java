package day4;

public class Main3 {
    public static void main(String[] args) {
        /*
         * 1. Create a Pokemon object called pikachu with the name "Pikachu", level 12,
         * and 35 health.
         * 2. Create an Item called potion named "Potion" that restores 20 health.
         * 3. Create a Trainer called "Ash" whose partner is pikachu.
         * 4. Print out the name of the Trainer's Pokémon.
         * 5. Print the current status of the Trainer's Pokémon.
         * 6. Print the info for the item.
         * 7. Use the item on the Trainer’s Pokémon.
         * 8. Print the updated status of the Pokémon after healing.
         * 9. Create another Pokemon called charmander with the name "Charmander", level
         * 10, and 28 health.
         * 10. Create a second Trainer called "Brock" whose partner is charmander. Print
         * out their Pokémon’s status, then use the same item on that Pokémon and print
         * the updated status.
         */

        Pokemon pikachu = new Pokemon("Pikachu", 12, 35);

        Item potion = new Item("Potion", 20);

        Trainer ash = new Trainer("Ash", pikachu);

        System.out.println(ash.getPartner().getName());

        System.out.println(ash.getPartnerStatus());

        System.out.println(potion.getInfo());

        ash.useItem(potion);

        System.out.println(ash.getPartnerStatus());

        Pokemon charmander = new Pokemon("Charmander", 10, 28);

        Trainer brock = new Trainer("Brock", charmander);
        System.out.println(brock.getPartner().getStatus());
        brock.useItem(potion);
        System.out.println(brock.getPartner().getStatus());
    }
}
