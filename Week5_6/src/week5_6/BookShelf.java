package week5_6;

public class BookShelf {
    public static void main(String[] args) {
    	Books book1 = new Books("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 1925);
        Books book2 = new Books("1984", "George Orwell", "Secker & Warburg", 1949);
        Books book3 = new Books("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960);

        // Displaying details
        System.out.println("Initial Books:");
        System.out.println(book1);
        System.out.println();
        System.out.println(book2);
        System.out.println();
        System.out.println(book3);

        // Updating
        book1.setPublisher("Penguin Classics");

        System.out.println("\nAfter Updating Publisher of Book1:");
        System.out.println(book1);

    }
}
