package collectionslist.collectionsarraylist;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void createAndShuffleBalls() {
        Lottery lottery = new Lottery();
        assertEquals(90, lottery.createAndShuffleBalls(90).size());
    }

    @Test
    public void wrongParameterShouldThrowException() throws IllegalArgumentException {
        int lotteryType = 10;
        int ballCount = 10;

        Exception ex = assertThrows(IllegalArgumentException.class, ()-> {
            new Lottery().selectWinningNumbers(lotteryType, ballCount);
        });
        assertEquals("Invalid draw!", ex.getMessage());
    }



    @Test
    void selectWinningNumbers() throws IllegalArgumentException{
        //Given
        Lottery lottery = new Lottery();
        int lotteryType = 6;
        int ballCount = 45;

        //When
        List<Integer>winningNumbers = lottery.selectWinningNumbers(lotteryType, ballCount);

        //Then

        assertEquals(lotteryType, new HashSet<>(winningNumbers).size());
        for (int winningNumber : winningNumbers) {
            assertEquals(true, winningNumber >0);
            assertEquals(true, winningNumber<= ballCount);
        }

    }
}