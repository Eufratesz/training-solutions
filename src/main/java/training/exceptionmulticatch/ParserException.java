package training.exceptionmulticatch;

import java.text.ParseException;

public class ParserException extends  RuntimeException{

    public ParserException (String message, Throwable cause) {
        super(message, cause);
    }
}
