public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby","F. Scott Fitzgerald");
        Member member = new Member("John Doe", 1);

        book.borrow();
        member.displayInfo();

        book.returnBook();

    }
}