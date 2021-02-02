package algorithmscount.bankaccounts;

public class BankAccount {

    private String nameOfOwner;
    private int accountNumber;
    private int balance;

    public BankAccount(String nameOfOwner, int accountNumber, int balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
