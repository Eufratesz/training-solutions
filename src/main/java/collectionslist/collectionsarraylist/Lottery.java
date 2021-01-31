package collectionslist.collectionsarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    public List<Integer> createAndShuffleBalls(int balls){
        List<Integer>listOfBalls = new ArrayList<>();
        for (int i =1; i <= balls; i++){
            listOfBalls.add(i);
        }
        Collections.shuffle(listOfBalls);
        return listOfBalls;
    }

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) throws IllegalArgumentException{

        if(ballCount <1 || ballCount <= lotteryType) {
            throw new IllegalArgumentException("Invalid draw!");
        }

        List<Integer>listOfBalls = createAndShuffleBalls(ballCount);
        List<Integer>winningNumbers = listOfBalls.subList(0, lotteryType);
        Collections.sort(winningNumbers);
        return winningNumbers;




    }
}
