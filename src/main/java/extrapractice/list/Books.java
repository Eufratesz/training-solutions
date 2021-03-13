package extrapractice.list;

import java.util.ArrayList;
import java.util.List;

public class Books {

    List<String> titles = new ArrayList<>();

    public void add(String title) {
        titles.add(title);
    }

    public List<String> findAllByPrefix(String prefix) {
        List<String> found = new ArrayList<>();
        for (String title : titles) {
            if (title.startsWith(prefix)) {
                found.add(title);
            }
        }
        return found;
    }


    public void removeByPrefix(String prefix) {
        List<String> removed = new ArrayList<>();
        for (String title : titles) {
            if (title.startsWith(prefix)) {
                removed.add(title);

            }
        }
        titles.removeAll(removed);
    }

    public List<String> getTitles() {
        return titles;
    }


    public static void main(String[] args) {
        Books books = new Books();

        books.add("1984");
        books.add("Állatfarm");
        books.add("Vuk");
        books.add("Vulkán");
        System.out.println(books.getTitles());


        System.out.println(books.findAllByPrefix("Vu"));

        books.removeByPrefix("Áll");
        System.out.println(books.getTitles());


    }
}
