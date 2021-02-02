package algorithmscount.bankaccounts;

import java.util.List;

public class TransactionCounter {

    public int countSmallerTransactionThan(List<Transaction>transactions, int maxAmount){
        int count =0;
        for(Transaction t: transactions) {
            if (t.getAmount() < maxAmount) {
                count++;
            }
        }
        return count;
    }
}
