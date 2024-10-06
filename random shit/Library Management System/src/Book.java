public class Book {
    // Attributes/Variables
    private String author;
    private String genre;
    private String title;
    private boolean available;

    // Constructor, used to initialize the "Book" object that we will create in the Main class which will use these variables/Attributes
    // It's essential to set these values during object creation to ensure that each book object is properly initialized
    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true; // Initially, the book is available
    }

    // Getter methods, used so other classes can access the "Book" objects' variables/attributes since they have the "private" access modifier
    // We also encapsulate the "Book" objects internal state, which will protect the integrity of the object's data and allows controlled access to it.
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return available;
    }
    // Method to check out the book, when the book is checked out, its availability status is set to 'false', indicating that it is not available.
    public void checkOut(){
        if (available){
            available = false;
            System.out.println();
            System.out.println("The book '" + title + "' has been checked out\n");
        } else {
            System.out.println("The book '" + title + "' is not available\n");
        }
    }
    // Method to return book, when the book is returned, it's availability status is set to 'true', indicating that it is available again.
    public void returnBook(){
        available = true;
        System.out.println("Thank your for returning the book '" + title + "'.");
    }
    // Method to display information about the book, used to help the user and the other parts of the program.
    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
    }
}
