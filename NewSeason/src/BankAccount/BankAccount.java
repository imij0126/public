package BankAccount;

public class BankAccount {
    int balance =0;
    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }
    public int stock(int amount){
        balance += amount;
        return balance;
    }
    public int checkMyBalance(){
        System.out.println("잔액 : " +balance + "원");
        return balance;
    }
}
