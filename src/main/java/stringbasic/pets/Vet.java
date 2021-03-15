package stringbasic.pets;

import java.util.ArrayList;
import java.util.List;

public class Vet {


    List<Pet>pets = new ArrayList<>();


    public void add(Pet newPet){
        for(Pet pet : pets){
            if(areEquals(pet, newPet)) {
                return;
            }
        }
        pets.add(newPet);
    }

    public boolean areEquals(Pet pet1, Pet pet2){
        return pet1.getRegNumber().equals(pet2.getRegNumber());
    }

    public List<Pet> getPets() {
        return pets;
    }
}
