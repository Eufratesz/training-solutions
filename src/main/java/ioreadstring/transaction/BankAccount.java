package ioreadstring.transaction;

public class BankAccount {

    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

//a settert én kihagytam.
    public void setBalance(double balance) {  //paraméterül azt adjuk meg, mennyivel növekedjen
        this.balance += balance;
    }
}
