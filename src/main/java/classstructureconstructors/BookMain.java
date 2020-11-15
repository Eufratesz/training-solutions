package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Agatha Christie", "There were none");
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());

       book.register("324835739");
       System.out.println("Registration number: " + book.getRegNumber());

    }
}
