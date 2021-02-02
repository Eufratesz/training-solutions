package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int countNumberOfAccounts(List<BankAccount> bankAccounts, int minAmount) {
        int count = 0;
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getBalance() > minAmount) {
                count++;
        }
        }
        return count;
    }
}
