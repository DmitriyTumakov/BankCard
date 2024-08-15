package ru.netology;

import ru.netology.cards.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(0, 10000);
        System.out.println(creditCard.getAllInfo());
        creditCard.replenish(5000);
        System.out.println(creditCard.getAllInfo());
        creditCard.pay(5000);
        System.out.println(creditCard.getAllInfo());
        creditCard.pay(3000);
        System.out.println(creditCard.getAllInfo());
        creditCard.replenish(2000);
        System.out.println(creditCard.getAllInfo());
        creditCard.replenish(2000);
        System.out.println(creditCard.getAllInfo());
    }
}