package week15d03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PostFinderTest {

    @Test
    void emptyContentOrTitleShouldThrowExcepiton(){
        PostFinder postFinder = new PostFinder(Arrays.asList(
                new Post(null, LocalDate.of(2020,1,1), "Content1", "John Doe")));
        assertThrows(IllegalArgumentException.class,()-> new PostFinder(Arrays.asList()).findPostsFor("John Doe"));
          //    assertEquals("Title or content must not be empty", ex.getMessage());
    }

    @Test
    void TestFindPostsFor() {
        PostFinder postFinder = new PostFinder(Arrays.asList(
                new Post("Title1", LocalDate.of(2020,1,1), "Content1", "John Doe")));
        assertEquals("Title1", postFinder.findPostsFor("John Doe").get(0).getTitle());
        assertEquals(LocalDate.of(2020,1,1), postFinder.findPostsFor("John Doe").get(0).getPublishedAt());
        assertEquals("Content1", postFinder.findPostsFor("John Doe").get(0).getContent());
        assertEquals("John Doe", postFinder.findPostsFor("John Doe").get(0).getOwner());



    }
}