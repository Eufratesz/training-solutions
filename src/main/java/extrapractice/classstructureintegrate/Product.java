package extrapractice.classstructureintegrate;

public class Product {

    private String name;

    private int price;


    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int increasePrice(int amount) {
        return price + amount;
    }

    public int decreasePrice(int amount) {
        return price - amount;
    }


    public static void main(String[] args) {

        Product product = new Product("car", 10_000_000);

        int increasedPrice = product.increasePrice(1_000_000);
        System.out.println(increasedPrice);

        int decreasedPrice = product.decreasePrice(3_000_000);
        System.out.println(decreasedPrice);
    }
}
