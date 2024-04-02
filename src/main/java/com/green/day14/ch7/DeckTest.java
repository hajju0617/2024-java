package com.green.day14.ch7;

public class DeckTest {
    public static void main(String[] args) {
//        Card c = new Card();
//        c.kind = "Spade";
//        c.number = "A";
////        System.out.printf("kind : %s, number : %s\n", c.kind,c.number);
//        System.out.println(c);  // 위의 문장을 이렇게도 쓸 수 있다 (오버라이딩) (카드 객체 주소값을 받음)
//
//        Object obj = "";       //object 는 모든 클래스의 조상 (최상위)
//        obj = 12;
//        obj = 1.1;
        Deck deck = new Deck();
        deck.printAllCard();
    }   //main
}

class Deck {
    final int CARD_NUM;
    Card[] cards;

    int idx = 0;
    Deck() {
        CARD_NUM = 52;
        cards = new Card[CARD_NUM];
        String[] kinds = { "가", "나", "다", "라" };
        for(int i = 0; i < kinds.length; i++) {
            for(int j = 1; j <= 13; j++) {
                Card c = new Card();
                c.kind = kinds[i];
                c.number = switch(j) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(j);
                };
                cards[idx++] = c;
            }

        }
    }
    void printAllCard() {
        for(Card c : cards) {
            System.out.println(c);
        }
    }
}
class Card {
    String kind; // 무늬
    String number; // 번호(A, 2 ~ 10, J, Q, K)

    @Override
    public String toString() {
        return String.format("%s(%s)", kind, number);
    }

}