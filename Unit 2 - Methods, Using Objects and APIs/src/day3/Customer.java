package day3;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double accountBalance;
    private ArrayList<Product> cart;

    // Constructor
    public Customer(String name, double accountBalance) {
        this.name = name;
        this.accountBalance = accountBalance;
        this.cart = new ArrayList<>();
    }

    // Methods
    // Precondition: The product exists and is available for purchase.
    // Postcondition: The product is added to the customer's cart.
    public void addToCart(Product product) {
        cart.add(product);
    }

    // Precondition: The customer has items in their cart.
    // Postcondition: Returns a string representation of the cart contents.
    public String getCart() {
        if (cart.isEmpty()) {
            return "Cart is empty.";
        }

        StringBuilder sb = new StringBuilder("Cart Contents:\n");
        for (Product p : cart) {
            sb.append("- ").append(p.getPrice()).append(" (Stock: ").append(p.getStock()).append(")\n");
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }
}