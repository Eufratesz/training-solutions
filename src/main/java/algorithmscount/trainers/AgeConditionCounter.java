package algorithmscount.trainers;

import java.util.List;

public class AgeConditionCounter {

    public int countElderThan(List<Trainer> trainers, int minAge){
        int count = 0;
        for(Trainer trainer : trainers) {
            if(trainer.getAge() >= minAge) {
                count++;
            }
        }
        return count;
    }

}
