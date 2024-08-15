package ru.netology.cards;

public abstract class BankCard {
    protected double balance;

    public BankCard(int balance) {
        this.balance = balance;
    }

    public abstract String getAllInfo();
    public abstract String getBalance();
    public abstract boolean pay(double amount);
}
