package day4;

public class LibraryCard {
    private String ownerName;
    private int booksCheckedOut;
    private Book lastBook; // Reference type!

    public LibraryCard(String ownerName) {
        this.ownerName = ownerName;
        this.booksCheckedOut = 0;
        this.lastBook = null;
    }

    public void checkOutBook(Book book) {
        booksCheckedOut++;
        lastBook = book;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getBooksCheckedOut() {
        return booksCheckedOut;
    }

    public String getLastBookTitle() {
        if (lastBook == null) {
            return "No books checked out yet.";
        }
        return lastBook.getTitle();
    }

    public String getStatus() {
        return ownerName + " has checked out " + booksCheckedOut + " book(s).";
    }
}