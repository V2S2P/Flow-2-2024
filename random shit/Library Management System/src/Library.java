import java.util.ArrayList;

public class Library {
    // Attributes/Instance Variables. We use an ArrayList to store the collection of books available in the library, the ArrayList will also make it
    // easier to to provide a dynamic size, allowing us to hold any number of books.
    private ArrayList<Book> books;

    // Constructor. When a Library object is created, the constructor will initialize the books list. It ensures that the Library object starts with an
    // empty collection of books, ready to have books added to it.
    public Library(){
        books = new ArrayList<>();
    }

    // Method to add a book to the library. It takes a Book object as a parameter and adds it to the books list. After adding the book, it provides
    // feedback to indicate that the book has been successfully added to the library.
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' has been added to the library.\n");
    }

    // Method to remove a book from the library. It takes a Book object as a parameter and attempts to remove it from the books list. If the book is found
    // and removed successfully, it provides feedback indicating that the book has been removed. If the book is not found in the library, it provides
    // feedback indicating that the book was not found.
    public void removeBook(Book book){
        if (books.remove(book)){
            System.out.println();
            System.out.println("Book '" + book.getTitle() + "' has been removed from the library.\n");
        } else {
            System.out.println("Book '" + book.getTitle() + "' not found in the library.\n");
        }
    }

    // Method to display all books in the library. If the books list is empty, it provides a message that the library is currently empty. If the books list
    // contains books, it iterates through the list and displays the title of each book.
    public void displayBooks(){
        if (books.isEmpty()){
            System.out.println("The library is currently empty.");
        } else {
            System.out.println();
            System.out.println("Books available in the library:");
            for (Book book : books){
                System.out.println("- " + book.getTitle());
            }
        }
    }

}
