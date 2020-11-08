package classstructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount (String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }


    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }

        // a transfer metódusa nem ment egyedül, meg kellett néznem.

    public void transfer (BankAccount to, int amount) {  //ez a to honnan jön?
        withdraw(amount);
        to.deposit(amount);
        }


    public String getInfo() {
        return (owner + " (" + accountNumber+ "): " + balance + " Ft");
    }

    public static void main(String[] args) {
        BankAccount bankAccountDadddy = new BankAccount( "10073217-12000098", "Tóth Kálmán", 1_000_000);
        bankAccountDadddy.deposit(10_000);
        System.out.println(bankAccountDadddy.getInfo());
        bankAccountDadddy.withdraw(20_000);
        System.out.println(bankAccountDadddy.getInfo());



        BankAccount bankAccountSon = new BankAccount("10073217-12000099", "Tóth Tibor", 500_000);
        bankAccountSon.deposit(10_000);
        System.out.println(bankAccountSon.getInfo());
        bankAccountSon.withdraw(20_000);
        System.out.println(bankAccountSon.getInfo());

        //innentől nem ment. Most már értem.
        bankAccountDadddy.transfer(bankAccountSon, 1);
        System.out.println(bankAccountDadddy.getInfo());
        System.out.println(bankAccountSon.getInfo());
    }

}

