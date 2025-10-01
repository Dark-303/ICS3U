package day3;

public class Main2 {
    public static void main(String[] args) {
        // Create two products
        Product laptop = new Product("Laptop", 999.99, 5);
        Product headphones = new Product("Headphones", 199.99, 10);

        // Create customer
        Customer alice = new Customer("Alice", 1200);
        
        // Add laptop and headphones to cart
        alice.addToCart(laptop);
        alice.addToCart(headphones);

        // View cart
        String cartContents = alice.getCart();
        System.out.println(cartContents);

        // Calculate and display total cost
        double totalCost = laptop.getPrice() + headphones.getPrice();
        System.out.println(totalCost);

        // Print item count
        System.out.println();
    }
}
