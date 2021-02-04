package collectionscomp;

import java.text.CollationKey;
import java.text.Collator;
import java.util.*;

public class OrderedLibrary{

    private List<Book>libraryBooks;

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> getLibraryBooks() {
        return libraryBooks;
    }

    public List<Book>orderedByTite() {
        List<Book>orderedListByTitle = new ArrayList<>(libraryBooks);
        Collections.sort(orderedListByTitle);
        return orderedListByTitle;
    }



    public List<Book>orderedByAuthor() {
        List<Book>orderedListByAuthor = new ArrayList<>(libraryBooks);
        Collections.sort(orderedListByAuthor, new AuthorComparator());
        return orderedListByAuthor;
    }

    public List<String>orderedByTitleLocale(Locale locale) {
        List<String>orderedByTitleHun = new ArrayList<>();
        for (Book book : libraryBooks) {
            orderedByTitleHun.add(book.getTitle());
        }

        Collator hunCollator = Collator.getInstance(locale);
        hunCollator.setStrength(Collator.PRIMARY);
        Collections.sort(orderedByTitleHun, hunCollator);

        return orderedByTitleHun;

        }


    }


