package properties;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertiesTest {

    @Test
    public void testProperties() {
        Properties p = new Properties();
        p.setProperty("host", "training360.com");
        System.out.println(p);
        assertEquals("training360.com", p.getProperty("host"));

        String s = p.getProperty("port");
        System.out.println(s);          //null értékkel tér vissza, ha nem találja.
        assertEquals(null, p.getProperty("port"));
        assertEquals("80", p.getProperty("port", "80"));    //a default value-t megtalálja.

    }

    @Test
    public void testLoad() {
        Properties p = new Properties();
        try (InputStream is = PropertiesTest.class.getResourceAsStream("/welcome.properties")) {   //test/resources
            p.load(is);

        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
        String value= p.getProperty("welcome.message");
        assertEquals("Hello World!!!", value);
    }

    @Test
    public void testSave() {
        Properties properties = new Properties();
        properties.setProperty("host", "training360.com");
        properties.setProperty("port", "80");

        try (Writer writer = new FileWriter("config.properties")) {
            properties.store(writer, null);
        }catch (IOException ioe) {
            throw new IllegalStateException("Cannot save file", ioe);   //a project főkönyvtárában megjelent az állomány
        }
    }

}
