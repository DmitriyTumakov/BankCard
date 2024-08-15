package ru.netology.cards.bonuscard;

import ru.netology.cards.DebitCard;

public class GoldDebitCard extends DebitCard {
    private static final double BONUS_PERCENT = 0.15;
    private static final int BONUS_LIMIT = 10000;
    private double bonusPoints;

    public GoldDebitCard(int balance) {
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
            balance -= amount - (amount * BONUS_PERCENT);
            return true;
        }
        return false;
    }
}
