package aaa.week03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneParserTest {

    @Test
    public void testPhoneParser(){
        PhoneParser phoneParser = new PhoneParser();

        Phone phone = phoneParser.parse("20-3249053");

        assertEquals("20", phone.getPrefix());
        assertEquals("3249053", phone.getNumber());
        assertEquals("20 3249053", phone.toString());
    }

}