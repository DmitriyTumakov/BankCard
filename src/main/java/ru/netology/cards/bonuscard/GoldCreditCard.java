package ru.netology.cards.bonuscard;

import ru.netology.cards.CreditCard;

public class GoldCreditCard extends CreditCard {
    private static final double BONUS_PERCENT = 0.05;
    private static final int BONUS_LIMIT = 15000;
    private double bonusPoints;
    private double creditBalance;

    public GoldCreditCard(int balance, int creditLimit) {
        super(balance, creditLimit);
        creditBalance = creditLimit;
    }

    @Override
    public boolean pay(double amount) {
        if (bonusPoints > 0) {
            amount -= bonusPoints;
        }
        if (bonusPoints < BONUS_LIMIT) {
            bonusPoints += amount * BONUS_PERCENT;
        }
        balance -= amount;
        if (balance < 0) {
            creditBalance += balance;
            balance = 0;
            return true;
        }
        return false;
    }
}
