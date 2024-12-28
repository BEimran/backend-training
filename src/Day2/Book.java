package Day2;

class Book {
    private String title;
    private String author;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.displayDetails();
    }
}

