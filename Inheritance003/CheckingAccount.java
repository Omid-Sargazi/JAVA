package Inheritance003;

public class CheckingAccount extends Account {
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
