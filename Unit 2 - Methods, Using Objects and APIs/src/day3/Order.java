package day3;

public class Order {
    private Customer customer;
    private Product product;

    // Constructor
    public Order(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    // Methods
    // Precondition: The order is created.
    // Postcondition: Returns a confirmation message for the order.
    public String confirmOrder() {
        return "Order confirmed! " + customer.getName() + " purchased " + product.getName() 
               + " for $" + product.getPrice();
    }
}

