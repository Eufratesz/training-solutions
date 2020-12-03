/*
unior/Mid level csoport mai gyakorlati feladata:
Készíts az week06d04 csomagban egy Budget osztályt, amely a konstruktorában Item példányokat vár listában (List).
Az Item tartalmazza az alábbi attribútumokat: int price, int month, String name. A Budget osztály tárolja el
egy attribútumban a konstruktorban megkapott items listát. Írjunk egy metódust, getItemsByMonth néven,
mely egy hónapot vár (1-12) és visszaadja a kiadásainkat az adott hónapban!
Bónusz feladat: ellenőrizzük a bemeneti paramétereket és írjunk tesztet!
 */

package week06d04;

import week06d04.Item;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private List<Item> items;

    public Budget(List<Item>items) {
        this.items = new ArrayList<>(items);
    }

    public List<Item> getItemsByMonth(int month) {
        if(month < 1 || month > 12){
            throw new IllegalArgumentException("Invalid month supplied.");
        }
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getMonth() == month) {
                result.add(item);
            }
        }
        return result;
    }





}



