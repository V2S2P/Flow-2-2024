import java.util.ArrayList;

public class LibMem {
    // Attributes/Variables, needed for managing the library member's account.
    private String name;
    private double memID;
    // borrowedBooks is an ArrayList that stores the books currently borrowed by the library member. Using an ArrayList allows for dynamic storage of books
    private ArrayList<Book> borrowedBooks;

    // Constructor, it initializes the 'name', 'id' and 'borrowedBooks' list for each library member. Initialization is crucial to ensure each member object
    // is properly initialized with necessary data.
    public LibMem(String name, double memID){
        this.name = name;
        this.memID = memID;
        borrowedBooks = new ArrayList<>();
    }
    // Getter methods for 'name' and 'id' variables, used to allow other classes to access these variables of this class.
    // The reason we don't use a getter method for our ArrayList is because then other classes would be able to access the information, which would be
    // going against the encapsulation principle. It would allow other classes to directly manipulate the list of borrowed books without proper validation.
    public String getName() {
        return name;
    }

    public double getMemID() {
        return memID;
    }
    // Method for 'borrowBok(Book book)', 'returnBook()' and 'displayBorrowBooks()'. The borrowBooks method allows the library member to borrow a book from the
    // library. It checks if the books is available and, if so, adds it to the member's list of borrowed books. It also updates the availability of the book
    public void borrowBook(Book book){
        if (book.isAvailable()){
            borrowedBooks.add(book);
            book.checkOut();
            System.out.println("Book '" + book.getTitle() + "' has been borrowed by " + name + "\n");
        } else {
            System.out.println("This book '" + book.getTitle() + "' is already borrowed\n");
        }
    }
    // Method for 'returnBook(Book book)'. This method allows a library member to return a borrowed book to the library. It removes the book from the
    // member's list of borrowed books and updates the availability status of the book.
    public void returnBook(Book returnedBook){
        if (borrowedBooks.contains(returnedBook)){
            borrowedBooks.remove(returnedBook);
            returnedBook.returnBook();
            System.out.println("Book '" + returnedBook.getTitle() + "' has been returned by " + name);
        } else {
            System.out.println(name + " has borrowed the following book(s):");
            /*for (Book book : borrowedBooks){
                System.out.println("- " + book.getTitle());
            }*/
        }
    }
    // Method for 'displayBorrowedBooks()'. This method displays the list of books currently borrowed by the library member. It provides a way for the
    // member to view their borrowed books.
    public void displayBorrowedBooks(){
        if (borrowedBooks.isEmpty()){
            System.out.println(name + " has not borrowed any books.");
        } else {
            System.out.println(name + " has borrowed the following books:");
            for (Book book : borrowedBooks){
                System.out.println("- " + book.getTitle());
            }
        }
    }

}
