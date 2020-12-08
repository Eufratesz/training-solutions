package training.methodchain;

public class Trainer {

    private String name;
    private int age;

    public Trainer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }
}
/*
Ezt nem nagyon használjuk, mert így a setterek nem felelnek meg a Javabeans szabványnak.
    public Trainer setName(String name) {
        this.name = name;
        return this;
    }

    public Trainer setAge(int age) {
        this.age = age;
        return this;
    }
}
*/


