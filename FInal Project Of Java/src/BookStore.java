import java.util.ArrayList;

public class BookStore {

    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();

        books.add("Java Programming");
        books.add("Python Basics");
        books.add("C++ Fundamentals");

        books.forEach(book ->
                System.out.println("Book: " + book));
    }
}