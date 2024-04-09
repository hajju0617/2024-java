package com.green.day19.blackjack;
import java.util.*;
public class Gamer {
    protected List<Card> cards;
    public Gamer() {
        cards = new ArrayList<>();
    }
    public void receiveCard(Card card) {
        cards.add(card);
    }
    public List<Card> openCards() {
        return cards;
    }
}
class GamerTest {
    public static void main(String[] args) {
        Gamer gamer = new Gamer();
        Card c = new Card("스페이드", "9");
        gamer.receiveCard(c);
        gamer.receiveCard(new Card("하트", "2"));
        List<Card> cards = gamer.openCards();
        System.out.println(c);
        System.out.println(cards);
    }
}