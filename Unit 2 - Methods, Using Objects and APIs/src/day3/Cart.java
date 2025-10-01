package day3;

public class Cart {
    private String items;

    // Constructor
    public Cart() {
        this.items = "";
    }

    // Methods
    // Precondition: The product exists and is available for purchase.
    // Postcondition: The product is added to the cart.
    public void addItem(Product product) {
        if (items.isEmpty()) {
            items = product.toString();
        } else {
            items += ", " + product.toString();
        }
    }

    // Precondition: The cart has items.
    // Postcondition: Returns a string representation of all items in the cart.
    public String getItems() {
        return items.isEmpty() ? "Cart is empty." : "Items in cart: " + items;
    }
}