package week09d03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SantaClaus {
    List<Person> personList;

    public SantaClaus(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void getThroughChimneys() {

        for( Person person : personList) {
            person.setPresent();

        }
    }


}
