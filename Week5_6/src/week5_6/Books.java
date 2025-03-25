package week5_6;

public class Books {
    
    static class Book {
        private String title;
        private String author;
        private String publisher;
        private String copyrightDate;

        // Constructor
        public Book(String title, String author, String publisher, String copyrightDate) {
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.copyrightDate = copyrightDate;
        }

        // Getter and Setter methods
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

        public String getCopyrightDate() {
            return copyrightDate;
        }

        public void setCopyrightDate(String copyrightDate) {
            this.copyrightDate = copyrightDate;
        }

        public String toString() {
            return "Book Details:\n" +
                   "Title: " + title + "\n" +
                   "Author: " + author + "\n" +
                   "Publisher: " + publisher + "\n" +
                   "Copyright Date: " + copyrightDate;
        }
    }

    public static void main(String[] args) {
        // Creating and initializing Book 
        Book book1 = new Book("Java Programming", "John Doe", "Tech Publishers", "2022");
        Book book2 = new Book("1984", "George Orwell", "Secker & Warburg", "1949");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", "1925");

        // Display book
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        // Update 
        book1.setTitle("Advanced Java Programming");
        book1.setCopyrightDate("2023");

        System.out.println("\nAfter updating book1 details:");
        System.out.println(book1);
    }
}
