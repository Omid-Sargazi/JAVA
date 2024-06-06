package Inheritance02;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Bank bank = new Bank();

        SavingAccount savings1 = new SavingAccount(5000);
        CheckingAccount checking1 = new CheckingAccount(1500);
        SavingAccount savings2 = new SavingAccount(10000);
        CheckingAccount checking2 = new CheckingAccount(800);

        bank.addAcount(savings1);
        bank.addAcount(checking1);
        bank.addAcount(savings2);
        bank.addAcount(checking2);
        System.out.println("Total interest: " + bank.calculateTotalInterest());
        System.out.println("Inheritance");
    }
}
