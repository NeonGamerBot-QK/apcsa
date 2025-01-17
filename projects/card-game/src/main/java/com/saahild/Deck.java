package com.saahild;

import java.util.ArrayList;

public class Deck {
    private ArrayList<String> cards;
 public Deck() {
initCards();
 }
 private void initCards() {
    String[] carrds = {
        StaticCardColor.BLUE,
      StaticCardColor.GREEN,
        StaticCardColor.RED,
       StaticCardColor.YELLOW,
    };

    for(int i = 0; i < 52;i++) {
        cards.add(carrds[(int) Math.round(Math.random() * carrds.length)]);
    }
 }
 public void shuffleCards() {
    for(int i = 0; i < cards.size(); i++) {
        int randomIndex = (int) Math.round(Math.random() * cards.size());
        String temp = cards.get(i);
        cards.set(i, cards.get(randomIndex));
        cards.set(randomIndex, temp);
    }
 }
 @Override
 public String toString() {
    return "Deck{" +
            "cards=" + cards +
            '}';
 }
}
