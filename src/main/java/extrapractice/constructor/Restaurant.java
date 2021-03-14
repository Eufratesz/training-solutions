package extrapractice.constructor;

import java.util.Arrays;
import java.util.List;

public class Restaurant {

    private List<String> menu;

    private String name;

    private int capacity;

    public static final int SEATS = 4;


    public Restaurant(String name, int numberOfTables){
        this.name = name;
        capacity = numberOfTables * SEATS ;
        this.menu = createMenu();
    }

    public List<String> createMenu(){
        return Arrays.asList("halászlé", "húsleves", "rántott hús", "sült hal");
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
