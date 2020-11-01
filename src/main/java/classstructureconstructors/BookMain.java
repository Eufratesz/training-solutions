package classstructureconstructors;

public class BookMain {
    public void main(String[] args){
        Book book = new Book ("Charles Dickens", "A Christmas Carol");

        book.register("98765");

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Registration number: " + book.getRegNumber());
    }


}


       /*
       Wrong solution:
        Book book = new Book ("Charles Dickens", "A Christmas Carol");

        System.out.println("What is the registration number?");
        Scanner scanner = new Scanner(System.in);
        String regNumber = scanner.nextLine();
        System.out.println("Registration number: " + regNumber);

        System.out.println(book.register());

        System.out.println("The book is now registered.");
*/




