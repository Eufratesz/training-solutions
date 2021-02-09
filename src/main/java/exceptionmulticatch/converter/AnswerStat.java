package exceptionmulticatch.converter;

import java.util.logging.Logger;
//import org.slf4j.LoggerFactory;


public class AnswerStat {

 //   private static final Logger LOGGER = LoggerFactory.getLogger(AnswerStat.class);  // nem lehet importálni.
    private BinaryStringConverter converter;

    public AnswerStat(BinaryStringConverter converter) {
        this.converter = converter;
    }


    public int answerTruePercent(String answers) {
        boolean[] booleans = convert(answers);
        int numberOFTrue = 0;
        for (int i = 0; i< booleans.length; i++){
            if (booleans[i]){
                numberOFTrue++;
            }
        }
        return (int)Math.round((double)numberOFTrue / booleans.length * 100);

    }

    public boolean[] convert(String checkboxes) {
        try {
            return converter.binaryStringToBooleanArray(checkboxes);
        } catch (NullPointerException | IllegalArgumentException ex) {
          //  LOGGER.error(ex.getMessage(), ex);
            throw new InvalidBinaryStringException("message", ex);
        }
    }


}
