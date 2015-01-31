package com.example.tylerholland.testingapp;

import java.util.Random;

public class Card {
    //Declare the suit enum
    public enum Suit {HEARTS, SPADES, CLUBS, DIAMONDS}
    //Declare the value enum
    public enum Value {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

    //Attributes of the card
    private Suit suit; //The card's suit
    private Value value; //The card's value

    /**
     * Normal constructor for a card
     * @param suit The card's suit
     * @param value The card's face value
     */
    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static Card generateRandomCard() {
        Random random = new Random();
        return new Card(Suit.values()[random.nextInt(Suit.values().length)], Value.values()[random.nextInt(Value.values().length)]);
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
