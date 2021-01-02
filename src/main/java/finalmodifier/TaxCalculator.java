package finalmodifier;

public class TaxCalculator {

    public static final double VAT = 0.27;  //megoldókulcsban: PERCENT = 27

    public double tax(double price) {
        return price * VAT;                 //megoldókulcsban: PERCENT/100
    }

    public double priceWithTax(double price) {
        return price* VAT + price;
    }

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.tax(1000));
        System.out.println(taxCalculator.priceWithTax(1000));
    }
}
