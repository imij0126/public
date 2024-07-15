package Object;

import BankAccount.BankAccount;

public class Object2 {
    public static void main(String[] args) {
        BankAccount yoon = new BankAccount();
        BankAccount park = new BankAccount();
        BankAccount kim = new BankAccount();

        yoon.deposit(5000);
        park.deposit(3000);
        kim.deposit(13000000);

        kim.stock(7000000);
        yoon.stock(-14500);
        park.stock(1000);

        yoon.withdraw(2000);
        park.withdraw(2000);

        yoon.checkMyBalance();
        park.checkMyBalance();
        kim.checkMyBalance();
    }
}
