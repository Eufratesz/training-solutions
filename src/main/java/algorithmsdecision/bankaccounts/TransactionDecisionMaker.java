package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TransactionDecisionMaker {


    public boolean containsCreditEntryGreaterThan(List<Transaction> transactions, LocalDateTime startTime, LocalDateTime endTime, int limit) {
        for (Transaction transaction : transactions) {
            if (transaction.isDebit()
                    && transaction.getDateOfTransaction().isAfter(startTime)
                    && transaction.getDateOfTransaction().isBefore(endTime)
                    && transaction.getAmount() > limit)
                return true;
        }
        return false;
    }


}




