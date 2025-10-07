package day4;

public class Main1 {
    public static void main(String[] args) {
        /*
        * 1. Create a Book object for the book "Wonder" by R.J. Palacio with 310 pages.
        * 2. Create a LibraryCard object for a student named "Madison".
        * 3. Print the summary of the first book using its method.
        * 4. Use the library card to check out the first book.
        * 5. Use the library card to check out the same book again.
        * 6. Print how many books the student has checked out using the method that
        * returns this value.
        * 7. Print the title of the last book the student checked out.
        * 8. Create a second Book object for the book "Hatchet" by Gary Paulsen with
        * 192 pages.
        * 9. Create another LibraryCard object for a student named "Avery".
        * Use the second library card to check out the second book. Print the status of
        * the second library card and the title of the last book checked out.
        */

        Book wonder = new Book("Wonder", "R.J. Palacio", 310);

        LibraryCard madison = new LibraryCard("Madison");

        System.out.println(wonder.getSummary());

        madison.checkOutBook(wonder);
        madison.checkOutBook(wonder);
        
        System.out.println(madison.getBooksCheckedOut());

        System.out.println(madison.getLastBookTitle());

        Book hatchet = new Book("Hatchet", "Gary Paulsen", 192);

        LibraryCard avery = new LibraryCard("Avery");

        avery.checkOutBook(hatchet);
        System.out.println(avery.getStatus());
        System.err.println(avery.getLastBookTitle());
    }
}
