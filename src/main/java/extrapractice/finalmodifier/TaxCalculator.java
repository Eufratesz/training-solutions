package extrapractice.finalmodifier;

public class TaxCalculator {

    public static final double TAX = 0.27;

    public double tax(double price){
        return price * TAX;
    }

    public double priceWithTax(double price){
        return price + price*TAX;
    }


    public static void main(String[] args) {
        TaxCalculator tc = new TaxCalculator();
        System.out.println(tc.tax(200));
        System.out.println(tc.priceWithTax(200));
    }
}
