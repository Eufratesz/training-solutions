package interfaceextends.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    void testCreate(){
        HasName hasName = new Trainer("John Doe", 30);
        HasNameAndAge hasNameAndAge = new Trainer("John Doe", 30);
    }

}