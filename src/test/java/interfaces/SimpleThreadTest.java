package interfaces;

import interfaces.simplethread.SimpleThread;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleThreadTest {

    @Test
    public void runWithEmptyTasks() {
        List<String> tasks = new ArrayList<>();
        SimpleThread simpleThread = new SimpleThread(tasks);

        assertEquals(0, simpleThread.getTasks().size());
        simpleThread.run();

        assertEquals(0, simpleThread.getTasks().size());

    }

    @Test
    public void runWithTasks() {
        List<String> tasks = new ArrayList<>();
        tasks.add("shopping");
        tasks.add("hoovering");
        tasks.add("washing-up");
        tasks.add("tidying");
        SimpleThread simpleThread = new SimpleThread(tasks);

        assertEquals(tasks.size(), simpleThread.getTasks().size());

        simpleThread.run();

        assertEquals(0, simpleThread.getTasks().size());
    }
}
