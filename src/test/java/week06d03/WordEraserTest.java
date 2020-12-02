package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEraserTest {

    @Test
    public void eraseWordTest() {
        WordEraser wordEraser = new WordEraser();
        String original = "az autó az elefánt az alma";
        String result = "autó elefánt alma";
        assertEquals(result, wordEraser.eraseWord(original, "az"));

    }
    @Test
    public void eraseWordWithScannerTest() {
        WordEraser wordEraser = new WordEraser();
        String original = "az autó az elefánt az alma";
        String result = "autó elefánt alma";
        assertEquals(result, wordEraser.eraseWord(original, "az"));

    }
}
