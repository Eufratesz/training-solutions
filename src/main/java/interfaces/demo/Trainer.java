package interfaces.demo;

public class Trainer implements HasName{

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public int getYearOfBirht(){
        return 1980;
    }
}
