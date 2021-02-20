package week03d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneParserTest {


    @Test
    void testParse() {
        //Given
        PhoneParser phoneParser = new PhoneParser();
        String phoneNumber = "30-4567890";

        //When
        Phone phone = phoneParser.parse(phoneNumber);
        System.out.println(phone);

        //Then
        assertEquals("\"30 4567890\"", phone.toString());
       // assertEquals("\"30 4567890\"", phoneParser.parse(phoneNumber).toString());
    }

}