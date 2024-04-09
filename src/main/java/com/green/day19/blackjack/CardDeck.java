package com.green.day19.blackjack;
import java.util.*;
public class CardDeck {
    public static final String[] PATTERNS = { "Spade", "Heart", "Diamong", "Club" };
    public static final int CARD_COUNT = 13;
    private List<Card> cards;

    public CardDeck() {
        cards = new ArrayList<>();
        for(int i = 0; i < PATTERNS.length; i++) {
            for(int j = 1; j <= CARD_COUNT; j++) {
                String pattern = PATTERNS[i];
                String denomination = getDenomination(j);
                Card c = new Card(pattern, denomination);
                cards.add(c);
            }
        }
    }
    private String getDenomination(int num) {
        return switch (num) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(num);
        };
    }
    public void showCards() {
//        System.out.println(list);   // 이렇게 해서 pattern,denomination 형식으로 출력되는 이유
//                                    // Card 클래스에 toString 이 오버라이딩 되어 있어서 가능
        for(Card c : cards) {
            System.out.println(c);
        }
//        System.out.println(list.size());
    }
    public Card draw() {
        int random = (int)(Math.random() * cards.size());
        return cards.remove(random);     // arraylist 는 지우는 값을 리턴 해줌

    }
}
class CardDeckTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.showCards();

        Card c = cd.draw();
        System.out.println("c : " + c);
        System.out.println("c : " + cd.draw());
        cd.showCards();
    }
}
