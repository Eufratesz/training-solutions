package aaa.week06;
/*
Hozz létre egy Product osztályt melynek adattagjai a név, kategória és ár, A kategória legyen enum
FROZEN, DAIRY, BAKEDGOODS, OTHER felsorolókkal! Készíts egy Store
osztályt benne egy Product listával, amit konstruktorban kap meg. Legyen egy getProductByCategoryName(Category),
ami visszaadja valamilyen adatszerkezetben, hogy a paraméterül kapott kategóriából hány darab van a listában!
*/
public class Product {

    private String name;
    private Category category;
    private int price;

    public Product(String name, Category category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category=" + category +
                '}';
    }
}
