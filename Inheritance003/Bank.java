package Inheritance003;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public double calculateTotalInterest() {
        double totalInterest = 0;
        for (Account account : accounts) {
            totalInterest += account.calculateInterest();
        }
        return totalInterest;
    }
}
