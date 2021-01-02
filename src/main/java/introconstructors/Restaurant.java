package introconstructors;

import java.util.Arrays;
import java.util.List;

public class Restaurant {

    public static final int SEATS = 4;
    private List<String> menu;
    private String name;
    private int capacity;


    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this.capacity = numberOfTables * SEATS;
        this.menu= generateMenu();
    }

   private List<String>generateMenu() {
        return Arrays.asList("soup", "meat", "fish", "garnish", "drink");
   }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
