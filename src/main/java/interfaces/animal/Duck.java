package interfaces.animal;

public class Duck implements Animal{
   // private int numberOfLegs = 2; eredetileg így oldottam meg.
   // private String name = "Duck";  eredetileg így oldottam meg.


    public static final int NUMBER_OF_LEGS = 2;

    @Override
    public int getNumberOfLegs() {
        return NUMBER_OF_LEGS;
    }

    @Override
    public String getName() {
        return "Duck";
    }
}
