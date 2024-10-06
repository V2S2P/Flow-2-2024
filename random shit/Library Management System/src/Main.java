public class Main {
    public static void main(String[] args) {
        // Create some book objects
        Book book1 = new Book("Java Programming","John Doe","Programming");
        Book book2 = new Book("Introduction to Algorithms","Thomas Cormen","Computer Science");
        Book book3 = new Book("To Kill a Mockingbird","Harper Lee","Fiction");

        // Create a library Object
        Library library = new Library();

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books in the library
        library.displayBooks();

        // Create library members
        LibMem member1 = new LibMem("Valdemar",1);
        LibMem member2 = new LibMem("Bob",2);

        // Members borrows books
        member1.borrowBook(book3);

        // Member2 tries to borrow the same book (should fail)
        member2.borrowBook(book1);

        // Member1 returns the book
        member1.returnBook(book1);

        // Member2 tries to borrow the book again (should succeed)
        member2.borrowBook(book1);

        // Display the books borrowed by member1 and member2
        member1.displayBorrowedBooks();
        member2.displayBorrowedBooks();

        /* Remove a book from the library
        library.removeBook(book3);
        */
        // Display all books in the library after removal
        library.displayBooks();
    }
}