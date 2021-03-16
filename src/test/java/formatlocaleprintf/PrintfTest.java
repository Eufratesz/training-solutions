package formatlocaleprintf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintfTest {

    @Test
    public void testPrintf(){

        System.out.printf("Hello %s!", "Jack");
        String s = String.format("Hello %s and %s!", "Jack", "Joe");
        assertEquals("Hello Jack and Joe!", s);
        System.out.println(s);

        String s1 = String.format("The value is %d", 500);
        assertEquals("The value is 500", s1);
        System.out.println(s1);

        String s2 = String.format("The value is %f", 1_0000.0 / 3);
        System.out.println(s2);                                 // 3333,333333
        String s3 = String.format("The value is %8.2f", 1_0000.0 / 3);
        System.out.println(s3);                                     //The value is  3333,33
        assertEquals("The value is  3333,33", s3);

    }

}