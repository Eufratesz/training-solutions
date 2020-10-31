package classstructureconstructors;

public class Book {

    private String author;
    private String title;
    private String regNumber;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
}

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void register(String regNumber) {

    }


}





/*


Legyen egy public void register(String regNumber) metódusa, mely a nyilvántartásba vételt implementálja,
és ennek paraméterül kell megadni a regisztrációs számot.

Írj egy main() metódust a BookMain osztályba, amivel kipróbálod a működését!
Az attribútumok kiolvasásához használj gettereket!
 */