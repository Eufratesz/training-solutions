package attributes.book;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("War and Peace");

        System.out.println(book.getTitle());

        book.setTitle("Animal farm");
        System.out.println(book.getTitle());
    }
}
