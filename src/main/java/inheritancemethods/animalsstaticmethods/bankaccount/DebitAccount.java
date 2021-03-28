package inheritancemethods.animalsstaticmethods.bankaccount;

public class DebitAccount {

    private String accountNumber;
    private long balance;
    private static final double COST = -3.0;
    private static final double MIN_COST = -200;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public  double getCOST() {
        return COST;
    }

    public  double getMinCost() {
        return MIN_COST;
    }

    public final long costOfTransaction(long amount) {
        return (amount* COST /100.0) <= MIN_COST ? (long)MIN_COST : (long)(amount* COST /100.0);
    }

    public void balanceToZero(){
         balance = 0;
    }

    public boolean transaction(long amountForTransaction) {
        long amountPlusCost = amountForTransaction + costOfTransaction(amountForTransaction);
        if(amountPlusCost<= balance){
            balance -= amountPlusCost;
            return true;
        }
        return false;
    }
}
