package clone.issuetracker;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CommentTest {



    @Test
    public void testCreateComment() {
        //Given
        LocalDateTime time = LocalDateTime.of(2020,1,2,10,30);
        //When
        Comment comment = new Comment("Comment1", time);
        //Then
        assertEquals("Comment1", comment.getText());
        assertEquals(time, comment.getTime());
    }

    @Test
    void testCreateCommentBasedOnAnotherComment(){
        //Given
        LocalDateTime time = LocalDateTime.of(2020,1,2,10,30);
        //When
        Comment comment = new Comment("Comment1", time);
        Comment anothercomment = new Comment(comment);
        //Then
        assertEquals("Comment1", anothercomment.getText());
        assertEquals(time, anothercomment.getTime());
    }

}
