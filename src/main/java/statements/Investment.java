package statements;

public class Investment {

    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active = true;

    public Investment (int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        return fund * days * interestRate / (365 * 100.0);  //adott időszakra kiszámított hozam
    }
    //ezt a részt nem tudtam egyedül megírni, de most már menni fog:)
    public double close (int days) {        //teljes kifizetett összeg: tőke + kamatok - kezelési ktsg.
        double totalAmount = getFund() + getYield(days) * (1-cost / 100);
        double payout = active ? totalAmount : 0;
        active = false;
        return payout;
    }





}
