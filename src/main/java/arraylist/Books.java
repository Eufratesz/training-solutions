package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> titles = new ArrayList<>();

    public void add(String title) {
        titles.add(title);
    }

    //Ez a metódus nem volt a feladatkiírásban:
    public void removeByPrefix(String prefix) {
        List<String>toDelete = new ArrayList<>();
        for(String title : titles) {
            if (title.startsWith(prefix)) {
                toDelete.add(title);
            }
        }
        titles.removeAll(toDelete);
    }



    public List<String> findAllByPrefix(String prefix) {
        List<String>found = new ArrayList<>();
        for(String title : titles) {
            if (title.startsWith(prefix)) {
                found.add(title);
            }
        }
        return found;
    }

    public List<String> getTitlesOfBooks() {
        return titles;
    }


    public static void main(String[] args) {
        Books books = new Books();
        books.add("Poems");
        books.add("Poetry");
        books.add("Poems and sonnets");
        books.add("E.A. Poe");
        System.out.println(books.getTitlesOfBooks());

        System.out.println(books.findAllByPrefix("Poem"));
        books.removeByPrefix("Poems");
        System.out.println(books.getTitlesOfBooks());

    }

}
