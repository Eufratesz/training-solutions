package filescanner.library;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    List<Book> books = new ArrayList<>();


    public void loadFromFile() {
        try (Scanner scanner = new Scanner(Library.class.getResourceAsStream("/listofbooks.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                createAndAddBook(line, ";");
            }
        }
    }

    private void createAndAddBook(String line, String regex) {
        String[] parts = line.split(regex);
        String regNum = parts[0];
        String author = parts[1];
        String title = parts[2];
        int yearOfPublish = Integer.parseInt(parts[3]);
        Book book = new Book(regNum, author, title, yearOfPublish);
        books.add(book);


    }


    public List<Book> getBooks() {
        return List.copyOf(books);
    }
}
