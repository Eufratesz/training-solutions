package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

    public boolean isBalanceBigger(List<BankAccount> accounts, int minAmount) {

        for(BankAccount ba : accounts ){
            if(ba.getBalance() > minAmount) {
                return true;
            }
        }
        return false;

    }
}
