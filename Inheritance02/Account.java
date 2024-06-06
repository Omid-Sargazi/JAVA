package Inheritance02;

import java.util.ArrayList;
import java.util.List;

public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        return 0;
    }

}

class SavingAccount extends Account {
    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.4;
    }
}

class CheckingAccount extends Account {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        if (balance > 1000) {
            return balance * 0.02;
        } else {
            return 0;
        }
    }
}

class Bank {
    private List<Account> acconts;

    public Bank() {
        this.acconts = new ArrayList<>();
    }

    public void addAcount(Account account) {
        acconts.add(account);
    }

    public double calculateTotalInterest() {
        double totalInterest = 0;
        for (Account account : acconts) {
            totalInterest += account.calculateInterest();
        }
        return totalInterest;
    }
}
