package BankAccountFactory;

public class Main {
    public static void main(String[] args) {
        BankAccountFactory account = new BankAccountFactory();
        BankAccount saving = account.createAccount("Savings");
        saving.deposit();
        BankAccount current = account.createAccount("Current");
        current.deposit();
    }
}
