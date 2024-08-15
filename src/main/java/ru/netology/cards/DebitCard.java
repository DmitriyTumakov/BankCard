package ru.netology.cards;

public class DebitCard extends BankCard {

    public DebitCard(int balance) {
        super(balance);
    }

    @Override
    public String getAllInfo() {
        return "Собственные средства: " + balance + '\n';
    }

    @Override
    public String getBalance() {
        return "Собственные средства: " + balance + '\n';
    }

    @Override
    public boolean pay(double amount) {
        if (amount < balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean replenish(double amount) {
        balance += amount;
        return true;
    }
}
