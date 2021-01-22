package ioreader.states;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StateRegisterTest {

    private StateRegister sr = new StateRegister();

    @Test
    void TestReadStatesfromFileWrongFileName() {
        Exception ex = assertThrows(IllegalStateException.class, ()-> sr.readStatesfromFile("wrongfilename.txt"));
        assertEquals("Cannot read file", ex.getMessage());
    }

    @Test
    public void TestReadStatesfromFile() {
        assertEquals(0, sr.getStates().size());

        sr.readStatesfromFile("stateregister.txt");
        assertEquals(50, sr.getStates().size());
        assertEquals("Alabama", sr.getStates().get(0).getStateName());
        assertEquals("Montgomery", sr.getStates().get(0).getCapital());
    }

    @Test
    public void TestWrongStatename() {
        Exception ex = assertThrows(IllegalArgumentException.class,()-> {
            sr.readStatesfromFile("stateregister.txt");
            sr.findCapitalByStateName("Germany");
        });
           assertEquals("The state does not exist!", ex.getMessage());
    }

    @Test
    void TestFindCapitalByStateName() {
        sr.readStatesfromFile("stateregister.txt");
        assertEquals("Annapolis", sr.findCapitalByStateName("Maryland"));
    }

    @Test
    void getStates() {
        assertEquals(0, sr.getStates().size());
        sr.getStates().add(new State("Indiana","Indianapolis"));
        assertEquals(0, sr.getStates().size());
    }
}