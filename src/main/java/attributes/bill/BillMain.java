package attributes.bill;

import java.util.List;

public class BillMain {

    public static void main(String[] args) {

        Bill bill = new Bill();
        bill.addItem(new Item("alma", 5, 1800.0));
        bill.addItem(new Item("körte", 2, 700.5));
        bill.addItem(new Item("banán", 1, 400.0));

        System.out.println(bill.calculateTotalPrice());


    }
}
