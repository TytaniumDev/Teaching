package com.example.tylerholland.testingapp;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public static Deck generateMasterDeck() {
        ArrayList<Card> generatedDeck = new ArrayList<Card>();
        for(Card.Suit suit : Card.Suit.values()) {
            for(Card.Value value : Card.Value.values()) {
                generatedDeck.add(new Card(suit, value));
            }
        }
        return new Deck(generatedDeck);
    }

    @Override
    public String toString() {
        String result = "Deck:\n";
        for(Card card : deck) {
            result += card + "\n";
        }
        return result;
    }
}
