package ioreader.states;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateTest {

    @Test
    public void testCreateState(){
        State state = new State("California", "Sacramento");
        assertEquals("California", state.getStateName());
        assertEquals("Sacramento", state.getCapital());
    }

}