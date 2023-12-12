package model.entities;

public class Account {

    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit (double amount) {
        this.balance += amount;
    }

    public void withdraw (double amount) {
        if (amount > withdrawLimit) {
            throw new IllegalArgumentException(
                    "The amount exceeds withdraw limit"
            );
        } else if (amount > balance) {
            throw new IllegalArgumentException(
                    "Not enough balance"
            );
        }
        this.balance -= amount;
    }

}
