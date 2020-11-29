/*
Készíts egy week05d04.Product osztályt, melyben egy termékről tárolod a nevét és a lejárati dátumát (LocalDate).
Legyen egy konstruktora, ami a nevet kapja meg illetve a lejárati dátumot három részletben int year, int month, int day.
(public Product(String name, int year, int month, int day) ).
A lejárati dátumot a konstruktorban állítsd össze.
Legyen mindkettőhöz getter metódus.
Készíts egy week05d04.Store osztályt, melyben van egy Productokat tároló lista. Legyen benne egy addProduct(Product)
metódus.

Bónusz: Legyen benne egy getNumberOfExpired() metódus, ami visszaadja a lejárt termékek számát. Használd a
LocalDate.now() és az isBefore() metódusokat.

Bónuszok: Csak akkor engedj hozzáadni egy terméket, ha nem járt le és a neve még nem szerepel a listában. Ha sikerült
 hozzáadni , akkor true-val térjen vissza, ha nem , akkor false.
 Tesztelj!

 */

package week05d04;

import java.time.LocalDate;
import java.time.LocalTime;

public class Product {

    private String name;
    private LocalDate expireDate;

    public Product(String name, int year, int month, int day) {
        this.name = name;
        expireDate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public boolean isExpired() {
        if (expireDate.isBefore(LocalDate.now())) {
            return true;
        }
        return false;
    }
}
