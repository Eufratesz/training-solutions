package week06d04;

public class Item {

    private String name;
    private int price;
    private int month;

    public Item(String name, int price, int month) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name can't be blank.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be bigger than 0");
        }
        if(month < 1 || month > 12){
            throw new IllegalArgumentException("Invalid month supplied.");
        }

        this.name = name;
        this.price = price;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }
}
