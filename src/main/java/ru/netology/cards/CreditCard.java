package ru.netology.cards;

public class CreditCard extends BankCard {
    private double creditBalance;
    private final int creditLimit;

    public CreditCard(int balance, int creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
        creditBalance = creditLimit;
    }

    @Override
    public String getAllInfo() {
        return "Кредитный лимит: " + creditLimit + '\n' +
                "Кредитные средства: " + creditBalance + '\n' +
                "Собственные средства: " + balance + '\n';
    }

    @Override
    public String getBalance() {
        return "Кредитные средства: " + creditBalance + '\n' +
                "Собственные средства: " + balance + '\n';
    }

    @Override
    public boolean pay(double amount) {
        balance -= amount;
        if (balance < 0) {
            creditBalance += balance;
            balance = 0;
            return true;
        }
        return false;
    }

    public boolean replenish(double amount) {
        if (creditBalance < creditLimit) {
            double result = creditLimit - creditBalance;
            if (amount >= result) {
                creditBalance += result;
                balance += (amount - result);
                return true;
            } else {
                creditBalance += amount;
                return false;
            }
        } else {
            balance += amount;
            return true;
        }
    }
}

