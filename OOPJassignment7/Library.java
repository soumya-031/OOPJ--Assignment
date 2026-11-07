import java.util.ArrayList;

public class Library {
    ArrayList<String> books = new ArrayList<>();

    void addBook(String book) {
        books.add(book);
        System.out.println(book + " added.");
    }

    void removeBook(String book) {
        books.remove(book);
        System.out.println(book + " removed.");
    }

    public static void main(String[] args) {
        Library l = new Library();

        l.addBook("Java");
        l.addBook("Python");

        System.out.println("Books: " + l.books);

        l.removeBook("Java");

        System.out.println("Books: " + l.books);
    }
}