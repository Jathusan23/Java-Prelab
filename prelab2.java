// Book class definition
class Book {
    // Attributes
    private final String title;
    private final String author;
    private final double price;

    // Constructor to initialize the attributes
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}

// Main class
public class prelab2 {
    public static void main(String[] args) {
        // Create an array of Book objects
        Book[] books = new Book[3];

        // Initialize Book objects
        books[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        books[1] = new Book("To Kill a Mockingbird", "Harper Lee", 7.99);
        books[2] = new Book("1984", "George Orwell", 8.99);

        // Display details of each book
        System.out.println("Book Details:");
        for (Book book : books) {
            book.displayDetails();
        }
    }
}
