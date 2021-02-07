package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionManager {

    private List<Book>library = new ArrayList<>();

    public CollectionManager(List<Book> library) {
        this.library = library;
    }

    public List<Book> createUnmodifiableLibrary() {
        /*Saját megoldás
        List<Book> unmodifiableLibrary = Collections.unmodifiableList(library);
        return unmodifiableLibrary;

         */
        return Collections.unmodifiableList(this.library);
    }

    public List<Book> reverseLibrary(){
        List<Book>reverseLibrary = new ArrayList<>(library);
        Collections.sort(reverseLibrary);           //Először sorbarendezi, majd megfordítja.
        Collections.reverse(reverseLibrary);
        return reverseLibrary;
    }

    public Book getFirstBook(){
        return Collections.min(library);
    }

    public Book getLastBook(){
        return Collections.max(library);
    }
}
