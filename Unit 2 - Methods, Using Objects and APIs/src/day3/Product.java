package day3;

public class Product {
    private String name;
    private double price;
    private int stock;

    // Constructor
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Methods
    // Precondition: The product exists.
    // Postcondition: Returns the price of the product.
    public double getPrice() {
        return price;
    }

    // Precondition: The product exists.
    // Postcondition: Returns the stock quantity of the product.
    public int getStock() {
        return stock;
    }

    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}