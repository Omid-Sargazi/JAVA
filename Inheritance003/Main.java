package Inheritance003;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount savings1 = new SavingsAccount(5000);
        CheckingAccount checking1 = new CheckingAccount(1500);
        SavingsAccount savings2 = new SavingsAccount(10000);
        CheckingAccount checking2 = new CheckingAccount(800);

        bank.addAccount(savings1);
        bank.addAccount(checking1);
        bank.addAccount(savings2);
        bank.addAccount(checking2);
        System.out.println("Total interest: " + bank.calculateTotalInterest());

    }
}
