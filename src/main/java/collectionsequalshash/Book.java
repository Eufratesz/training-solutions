package collectionsequalshash;

import java.util.Objects;

public class Book {

    private String regNumber;
    private String author;
    private String title;

    public Book(String regNumber, String author, String title) {
        this.regNumber = regNumber;
        this.author = author;
        this.title = title;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "regNumber='" + regNumber + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';

        //Book{regNumber='1223345', author='Agatha Christie', title='And there were none'}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        return author !=null ? author.equals(book.author) : book.author == null;
    }

    @Override
    public int hashCode() {
        int result = title!=null ? title.hashCode() :0;
        result = 31* result + (author != null ? author.hashCode() :0);
        return result;
    }
}
