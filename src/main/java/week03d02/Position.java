package week03d02;
/*
Position osztály: name és bonus attributum. Egy alkalmazotti pozíciót jelöl, melynek a bonus attribútuma tárolja, hogy
ebben a pozícióban évente mennyi bónuszt kap egy alkalmazott.
Main metódusban hozz létre egy Position objektumokat tartalmazó listát!
Menj végig a lista elemein, és írd ki azokat, ahol a bónusz magasabb, mint 150_000. Azonban a kiírás formátumát a
Position osztály toString() metódusában implementáld!
 */

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String name;

    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Name of the position: " + getName() + " Bonus of the position: " + getBonus();
    }


    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    public static void main(String[] args) {
        List<Position> positions = new ArrayList<>();
        positions.add(new Position("manager", 200_000));
        positions.add(new Position("employee1", 155_000));
        positions.add(new Position("trainee", 50_000));


        for (Position position : positions) {
            if(position.getBonus() > 150_000){

                System.out.println(position.toString());
            }
        }

    }
}
