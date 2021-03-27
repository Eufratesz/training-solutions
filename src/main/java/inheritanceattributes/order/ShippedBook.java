package inheritanceattributes.order;

import inheritanceattributes.book.Book;

public class ShippedBook extends Book {

    private int shippingCost;

    public ShippedBook(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingCost = shippingCost;
    }

    public int getShippingCost() {
        return shippingCost;
    }

    @Override
    public String toString() {
        return getTitle() + ":"+ price + " - " + getShippingCost();
    }


    public int order(int pieces) {
        return price * pieces + shippingCost;
    }
}
