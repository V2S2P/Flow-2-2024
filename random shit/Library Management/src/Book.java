 class Book extends Item {
    private String author;
    private boolean available;

    public Book(String title, String author){
        super(title);
        this.author = author;
        this.available = true;
    }

    public void borrow(){
        if (available){
            available = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book not available: " + title);
        }
    }

    public void returnBook(){
        available = true;
        System.out.println("Book returned: " + title);
    }
}
