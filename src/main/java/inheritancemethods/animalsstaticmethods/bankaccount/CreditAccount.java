package inheritancemethods.animalsstaticmethods.bankaccount;

public class CreditAccount extends DebitAccount {

    private long overdraftLimit;

    public CreditAccount(String accountNumber, long balance, long overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public long getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public boolean transaction(long amountForTransaction) {
        long amountPlusCost = amountForTransaction + costOfTransaction(amountForTransaction);
        if (amountPlusCost <= overdraftLimit + getBalance()) {
            super.transaction(amountForTransaction);
        } else {
            long credit = amountForTransaction - getBalance();
            balanceToZero();
            overdraftLimit -= credit - costOfTransaction(amountForTransaction);
        }
        return true;
    }
}
