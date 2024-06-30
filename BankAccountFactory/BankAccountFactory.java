package BankAccountFactory;

public class BankAccountFactory {
    public static BankAccount createAccount(String accountType) {
        if (accountType == null) {
            return null;
        } else if (accountType == "Savings") {
            return new SavingsAccount();
        } else if (accountType == "Current") {
            return new CurrentAccount();
        }
        return null;
    }
}
