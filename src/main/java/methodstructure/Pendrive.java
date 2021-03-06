package methodstructure;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Pendrive: {" +
                "Name: " + name + '\'' +
                ", capacity: " + capacity +
                "Gb, price: " + price + "Ft" +
                '}';
    }

    public void risePrice (int percent) {
        this.price = this.price * (percent / 100);
    }

    private double pricePerCapacity(){
        return (double) price / capacity;
    }

    public int comparePricePerCapacity(Pendrive other) {
        double ppc = pricePerCapacity();
        double otherPpc = other.pricePerCapacity();

        if (ppc > otherPpc) {
            return 1;
        }
        if (ppc < otherPpc) {
            return -1;
        }
            return 0;
    }


    public boolean cheaperThan(Pendrive other) {
       return this.price < other.price;
    }

}
