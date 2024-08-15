package ru.netology.cards.bonuscard;

import ru.netology.cards.DebitCard;

public class BlackDebitCard extends DebitCard {
    private static final double BONUS_PERCENT = 0.05;
    private static final int BONUS_LIMIT = 5000;
    private double bonusPoints;

    public BlackDebitCard(int balance) {
        super(balance);
        bonusPoints = 0;
    }

    @Override
    public boolean pay(double amount) {
        if (bonusPoints > 0) {
            amount -= bonusPoints;
        }
        if (amount < balance) {
            if (bonusPoints < BONUS_LIMIT) {
                bonusPoints += amount * BONUS_PERCENT;
            }
            balance -= amount;
            return true;
        }
        return false;
    }
}
