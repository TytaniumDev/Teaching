package com.example.tylerholland.testingapp;

public class Tester {
    public static void main(String [] args) {
        Card test = new Card(Card.Suit.CLUBS, Card.Value.ACE);
        System.out.println(test);
        System.out.println(Card.generateRandomCard());
        System.out.println(Card.generateRandomCard());
        System.out.println(Card.generateRandomCard());
        System.out.println(Card.generateRandomCard());
        System.out.println(Card.generateRandomCard());
        System.out.println(Card.generateRandomCard());
        System.out.println(Card.generateRandomCard());
        System.out.println(Card.generateRandomCard());
        System.out.println(Card.generateRandomCard());
        System.out.println(Card.generateRandomCard());
        System.out.println(Deck.generateMasterDeck());

    }
}
