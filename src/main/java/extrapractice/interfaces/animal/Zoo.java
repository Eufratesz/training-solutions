package extrapractice.interfaces.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo{

    private List<Animal> animals = new ArrayList<>();

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimals(){
        int count = 0;
        for(Animal animal: animals){
            count++;
        }
        return count;
    }

    public int getNumberOfLegs(){
        int amount = 0;
        for(Animal animal: animals){
            int legs = animal.getNumberOfLegs();
            amount += legs;
        }
        return amount;
    }
}
