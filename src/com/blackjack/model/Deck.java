package com.blackjack.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {
    private final List<Card> cards = new ArrayList<>(Arrays.asList(Card.values()));
}