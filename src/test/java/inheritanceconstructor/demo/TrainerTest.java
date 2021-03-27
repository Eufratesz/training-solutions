package inheritanceconstructor.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void testCreate(){
        System.out.println(new Trainer("John Doe", 30, Collections.emptyList()));
    }

}