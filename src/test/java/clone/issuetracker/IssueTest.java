package clone.issuetracker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class IssueTest {

    private LocalDateTime time = LocalDateTime.of(2020, 1,31,8,0);
    private Issue issue = new Issue("Issue1", time, Status.IN_PROGRESS);

    @BeforeEach
    public void addComments(){
        issue.getComments().add(new Comment("Comment1", LocalDateTime.now()));
        issue.getComments().add(new Comment("Comment2", LocalDateTime.now()));
    }

    @Test
    void createIssue() {
        assertEquals("Issue1", issue.getName());
        assertEquals(time, issue.getTime());
        assertEquals(Status.IN_PROGRESS, issue.getStatus());
    }

    @Test
    void testAnotherIssue(){
        //When
        Issue anotherIssue = new Issue(issue, CopyMode.WITHOUT_COMMENTS);
        //Then
        assertEquals("Issue1", anotherIssue.getName());
        assertEquals(time, anotherIssue.getTime());
        assertEquals(Status.IN_PROGRESS, anotherIssue.getStatus());
        assertEquals(true, anotherIssue.getComments().isEmpty());
    }

    @Test
    void testDeepCopyIssue(){
        //When
        Issue anotherIssue= new Issue(issue, CopyMode.WITH_COMMENTS);
        //Then
        assertEquals("Issue1", anotherIssue.getName());
        assertEquals(time, anotherIssue.getTime());
        assertEquals(Status.IN_PROGRESS, anotherIssue.getStatus());
        assertEquals(2, anotherIssue.getComments().size());

        anotherIssue.getComments().get(0).setText("Comment1 modified");
        assertEquals("Comment1", issue.getComments().get(0).getText());
        assertEquals("Comment1 modified", anotherIssue.getComments().get(0).getText());

    }


}