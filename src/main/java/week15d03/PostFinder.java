package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PostFinder {
    /*
Adott az alábbi osztály:
java
public class Post {
    private String title;
    private LocalDate publishedAt;
    private String content;
    private String owner;
}
Implementáljunk a PostFinder osztályban egy public List<Post> findPostsFor(String user) metódust az alábbi módon:
- Csak olyan Post-ot adjunk vissza, amelynek az owner-e megegyezik a megadott user-rel
- A Post publishedAt dátuma korábbi kell, hogy legyen, mint a LocalDate.now()
- A content és a title nem lehet üres
Tároljunk egy List<Post> objektumot a PostFinder osztályban, melyet konstruktor paraméterként kap meg és ezt használjuk!
 */

    List<Post> postList;

    public PostFinder(List<Post> postList) {
        this.postList = postList;
    }

    public List<Post> findPostsFor(String user) {
        Objects.requireNonNull(user, "User is null!");
        List<Post> result = new ArrayList<>();
        for (Post p : postList) {
            if(!p.getContent().isEmpty() && !p.getTitle().isEmpty() &&
            user.equals(p.getOwner()) && (p.getPublishedAt().isBefore(LocalDate.now()))){
                result.add(p);
            }
        }
        return result;
    }

    public List<Post> getPostList() {
        return postList;
    }
}
