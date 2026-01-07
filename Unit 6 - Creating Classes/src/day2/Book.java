package day2;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        yearPublished = 2000;
        price = 9.99;
    }

    public Book(String title) {
        this.title = title;
        author = "Unknown Author";
        yearPublished = 2000;
        price = 9.99;
    }

    public void displayDetails() {
        System.out.print("Title : " + title);
        System.out.print(" || ");
        System.out.print("Author : " + author);
        System.out.print(" || ");
        System.out.print("Year Published : " + yearPublished);
        System.out.print(" || ");
        System.out.print("Price : " + price);
        System.out.println();
    }

    public void displayDetails(boolean showTitleAndAuthorOnly) {
        if (showTitleAndAuthorOnly) {
            System.out.print("Title : " + title);
            System.out.print(" || ");
            System.out.print("Author : " + author);
        } else this.displayDetails();
    }

    public void displayDetails(String showTitleOnly) {
        // Do I need the else?
        if (showTitleOnly.equals("title")) {
            System.out.print("Title : " + title);
        } else this.displayDetails();
    }
}