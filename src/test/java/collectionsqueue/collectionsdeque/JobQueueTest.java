package collectionsqueue.collectionsdeque;

import collectionsqueue.job.Job;
import collectionsqueue.job.NoJobException;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

class JobQueueTest {

    @Test
    void emptyDequeShouldThrowExcetion() throws NoJobException {
        Exception ex = assertThrows(NoJobException.class,()-> {
            new JobQueue().dispatchUrgentJob(new ArrayDeque<>());
        });
        assertEquals("No job, relax!",ex.getMessage());

    }

    @Test
    void urgentJobShouldComeFromHead() throws NoJobException {
        //Given
        Job urgent= new Job(4, "urgent");
        Job notUrgent = new Job (6, "not urgent");
        JobQueue jq = new JobQueue();

        //When
        Deque<Job> jobs = jq.addJobByUrgency(urgent, notUrgent);
        Job firstJob = jq.dispatchUrgentJob(jobs);

        //Then
        assertEquals("urgent", firstJob.getJobDescription());
        assertEquals(4, firstJob.getPriority());
        assertTrue(firstJob.isUrgent());
    }

    @Test
    void notUrgentJobShouldComeFromTail() throws NoJobException {
        //Given
        Job urgent= new Job(3, "urgent");
        Job notUrgent= new Job (9, "not urgent");
        JobQueue jq = new JobQueue();

        //When
        Deque<Job>jobs = jq.addJobByUrgency(urgent, notUrgent);
        Job lastJob = jq.dispatchNotUrgentJob(jobs);

        //Then
        assertEquals("not urgent", lastJob.getJobDescription());
        assertEquals(9, lastJob.getPriority());
        assertFalse(lastJob.isUrgent());






















    }

}