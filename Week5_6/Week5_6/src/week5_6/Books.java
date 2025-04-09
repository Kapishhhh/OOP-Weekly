package week5_6;

class Book {
    private String title;
    private String author;
    private String publisher;
    private int copyrightDate;

    // Constructor 
    public Book(String title, String author, String publisher, int copyrightDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyrightDate = copyrightDate;
    }

    // Getter and Setter  
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Getter and Setter 
    public int getCopyrightDate() {
        return copyrightDate;
    }

    public void setCopyrightDate(int copyrightDate) {
        this.copyrightDate = copyrightDate;
    }

    @Override
    public String toString() {
        return "Book Details:\n" +
               "Title: " + title + "\n" +
               "Author: " + author + "\n" +
               "Publisher: " + publisher + "\n" +
               "Copyright Date: " + copyrightDate;
    }
}

public class Books {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 1925);
        Book book2 = new Book("1984", "George Orwell", "Secker & Warburg", 1949);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960);

        // Display detail
        System.out.println("Initial Books:");
        System.out.println(book1);
        System.out.println();
        System.out.println(book2);
        System.out.println();
        System.out.println(book3);

        //updating the publisher of book1
        book1.setPublisher("Penguin Classics");

        System.out.println("\nAfter Updating Publisher of Book1:");
        System.out.println(book1);
    }
}
