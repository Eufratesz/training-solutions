package aaa.week09;

import java.util.ArrayList;
import java.util.List;

public class SantaClaus {

    List<Person>personList;

    public SantaClaus(List<Person> personList) {
        this.personList = personList;
    }


    public void getThroughChimneys(){
        for(Person person : personList){
            person.setPresent();
        }
    }


    public List<Person> getPersonList() {
        return personList;
    }
}
