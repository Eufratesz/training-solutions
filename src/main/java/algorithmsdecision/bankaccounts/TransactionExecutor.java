package algorithmsdecision.bankaccounts;

import java.util.List;

public class TransactionExecutor {

    public void executeTransactions(List<Transaction> transactions, List<BankAccount> accounts) {
        for (Transaction transaction : transactions) {
            BankAccount accountRelatedToTransaction = findBankAccount(accounts, transaction.getAccountNumber());
            if(accountRelatedToTransaction != null) {
                executeTransaction(transaction, accountRelatedToTransaction);
            }
            else{
                transaction.setNotExecutedSuccessfully();
            }
        }
    }

    public void executeTransaction(Transaction transaction, BankAccount accountRelatedToTransaction) {
        if (transaction.isCredit()) {
            accountRelatedToTransaction.deposit(transaction.getAmount());
            transaction.setExecutedSuccessfully();
        } else {
            if (accountRelatedToTransaction.withdraw(transaction.getAmount())) {
                transaction.setExecutedSuccessfully();
            } else {
                transaction.setNotExecutedSuccessfully();
            }
        }
    }


    private BankAccount findBankAccount(List<BankAccount> accounts, String accountNumber) {
        for (BankAccount bankAccount : accounts) {
            if(bankAccount.getAccountNumber().equals(accountNumber)){
                return bankAccount;
            }
        }
        return null;
    }


}
