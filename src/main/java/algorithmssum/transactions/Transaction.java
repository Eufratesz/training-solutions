package algorithmssum.transactions;

public class Transaction {

    private int accountNumber;
    private int amount;
    private TransactionOperation transactionOperation;

    public Transaction(int accountNumber, int amount, TransactionOperation transactionOperation) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionOperation = transactionOperation;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isCredit(){
        return transactionOperation == TransactionOperation.CREDIT;
    }

    public boolean isDebit() {
        return transactionOperation == TransactionOperation.DEBIT;
    }
}
