package extrapractice.classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String owner1 = scanner.nextLine();
        System.out.println("What is your account number?");
        String accountNumber1 = scanner.nextLine();
        System.out.println("How much is your balance?");
        int balance1 = scanner.nextInt();
        scanner.nextLine();
        BankAccount bankAccount = new BankAccount(accountNumber1, owner1, balance1);


        System.out.println("What is your name?");
        String owner2 = scanner.nextLine();
        System.out.println("What is your account number?");
        String accountNumber2 = scanner.nextLine();
        System.out.println("How much is your balance?");
        int balance2 = scanner.nextInt();
        scanner.nextLine();
        BankAccount anotherBankAccount = new BankAccount(accountNumber2, owner2, balance2);


        System.out.println(bankAccount.getInfo());
        System.out.println(anotherBankAccount.getInfo());

        System.out.println("How much would you like to deposit?");
        int depositAmount= scanner.nextInt();
        scanner.nextLine();
        bankAccount.deposit(depositAmount);
        System.out.println(bankAccount.getInfo());

        System.out.println("How much would you like to withdraw?");
        int withdrawAmount = scanner.nextInt();
        scanner.nextLine();
        bankAccount.withdraw(withdrawAmount);
        System.out.println(bankAccount.getInfo());

        System.out.println("how much would you like to transfer?");
        int transferAmount = scanner.nextInt();
        scanner.nextLine();
        bankAccount.transfer(anotherBankAccount, transferAmount);

        System.out.println(bankAccount.getInfo());
        System.out.println(anotherBankAccount.getInfo());


    }
}
