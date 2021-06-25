package aaa.week06;
/*
Az Item tartalmazza az alábbi attribútumokat: int price, int month, String name.
 */

import java.time.LocalDate;

public class Item {

    private int price;
    private LocalDate date;
    private int month;
    private String name;

    public Item(int price, int year, int month, int day, String name) {
        if(price < 0) {
            throw new IllegalArgumentException("Wrong price!");
        }
        this.price = price;
        this.name = name;
        date = LocalDate.of(year, month, day);  //A paraméterül megadott adatokból összerakja a dátumot.
    }
//Konstruktor-túlterhelés
    public Item(int price, LocalDate date, String name) {
        this.price = price;
        this.date = date;
        this.name = name;
    }

    //Konsturktor-túlterhelés
    public Item(int price, int month, String name) {
        this.price = price;
        this.month = month;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }
}
