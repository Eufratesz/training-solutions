package extrapractice.statements;

public class Investment {

    private double cost = 0.3;

    private int fund;

    private int interestRate;

    private boolean active = true;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
    }


    public double getYield(int days) {
        return fund * interestRate * days/ (365*100);
    }

    public double close(int days) {
        double total = (getFund() + getYield(days) * 1- (cost / 100));
        double payout = active ? total : 0;
        active = false;
        return payout;
    }

    public int getFund() {
        return fund;
    }


}
