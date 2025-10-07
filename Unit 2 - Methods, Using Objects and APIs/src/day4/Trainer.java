package day4;

public class Trainer {
    private String name;
    private Pokemon partner;

    public Trainer(String name, Pokemon partner) {
        this.name = name;
        this.partner = partner;
    }

    public String getName() {
        return name;
    }

    public Pokemon getPartner() {
        return partner;
    }

    public void useItem(Item item) {
        partner.heal(item.getHealAmount());
    }

    public String getPartnerStatus() {
        return partner.getStatus();
    }
}