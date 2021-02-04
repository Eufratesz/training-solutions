package collectionscomp;

public class Book implements Comparable<Book>{

    private String title;
    private String author;
    private int regNumber;

    public Book(String title, String author, int regNumber) {
        this.title= title;
        this.author =author;
        this.regNumber = regNumber;

    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return regNumber + " " + title + " " + author;
    }

    public int getRegNumber() {
        return regNumber;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}
