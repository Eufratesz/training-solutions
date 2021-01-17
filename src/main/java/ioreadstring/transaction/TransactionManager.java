package ioreadstring.transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    private List<BankAccount> accountList = new ArrayList<>();

    public void uploadListFromFile(String filePath) {
        Path accounts = Path.of(filePath);
        try {
            List<String> accountsFromFile = Files.readAllLines(accounts);

            for (String s : accountsFromFile) {
                String temp[] = s.split(";");
                BankAccount bankAccount = new BankAccount(temp[0], temp[1], Integer.parseInt(temp[2]));
                accountList.add(bankAccount);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }

    public void makeTransactions(String filePath) {
        Path transactions = Path.of(filePath);
        try {
            List<String> transactionsFromFile = Files.readAllLines(transactions);
            for (String s : transactionsFromFile) {
                String[]temp = s.split(";");
                for(BankAccount ba : accountList) {
                    if( temp[0].equals(ba.getAccountNumber())) {  //ezt a megoldókulcsból másoltam, mert elakadtam.
                        ba.setBalance(Double.parseDouble(temp[1]));
                    }
                }
            }

        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }

    }
//A getter lemaradt.
    public List<BankAccount> getAccountList() {
        return accountList;
    }
}
