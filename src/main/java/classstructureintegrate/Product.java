package classstructureintegrate;

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



    public void increasePrice(int amount) {
        price = price + amount;
    }

    public void decreasePrice(int amount) {
        price = price - amount;
    }


    public static void main(String[] args) {
    Product product = new Product("smart TV", 500_000);
        System.out.println(product.getName() + ": " + product.getPrice());


        product.increasePrice(50_000);
        System.out.println(product.getName() + ": increased price: " + product.getPrice());
        product.decreasePrice(40_000);
        System.out.println(product.getName() + ": decreased price: " + product.getPrice());


        }
}

