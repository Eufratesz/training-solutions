package collectionsqueue.collectionspriorityqueue;

import collectionsqueue.job.Job;
import collectionsqueue.job.NoJobException;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class JobDispatcherTest {

    @Test
    void emptyQueueShouldThrowException() throws NoJobException {
        Exception ex = assertThrows(NoJobException.class, ()-> {
            new JobDispatcher().dispatchNextJob(new PriorityQueue<>());
        });
        assertEquals("No job available, relax!", ex.getMessage());
    }

    @Test
    void highestPriorityShouldBeTheFirst() throws NoJobException {
        //Given
        Job mostImportant = new Job(1, "mostImportant");
        Job leastImportant = new Job(10, "least important");
        Job mediumImportant = new Job(5, "medium important");

        JobDispatcher jdp = new JobDispatcher();

        //When
        Queue<Job> availableJobs= jdp.addJob(mediumImportant, leastImportant, mostImportant);
        Job nextJob = jdp.dispatchNextJob(availableJobs);

        //Then
        assertEquals("mostImportant", nextJob.getJobDescription());
        assertEquals(1, nextJob.getPriority());
    }

}