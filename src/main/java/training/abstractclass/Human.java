package training.abstractclass;

public abstract class Human {

    public static final int DEFAULT_FREE_TIME = 4;

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static int getDefaultFreeTime() {
        return DEFAULT_FREE_TIME;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract int getFreeTime();

    public abstract void work();
}
