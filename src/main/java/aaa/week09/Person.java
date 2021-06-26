package aaa.week09;

import java.util.Random;

public class Person {

    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setPresent() {
        Random random = new Random();

        if(age > 14){
            int index = random.nextInt(Present.values().length-1)+1;  // csak az 1.2.3. indexű, tehát a 0. indexű, a toy ne legyen benne.
            present = Present.values()[index];
        }else{
            present = Present.values()[random.nextInt(Present.values().length)];  //0-3.indexű ajándékok
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Present getPresent() {
        return present;
    }
}
