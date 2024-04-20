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
        //deck.printAllCard();
        Card c = deck.pick();
        System.out.println(c);

        Card c2 = deck.pick(5);
        System.out.println(c2);

        deck.shuffle();
        deck.printAllCard();
    }   //main
}
class Deck {
    final int CARD_NUM;
    Card[] cards;

    Card pick() {
        int rIdx = (int)(Math.random() *  cards.length);
        Card c = cards[rIdx];
        return c;
    }
    Card pick(int n) {
        Card c = cards[n];
        return c;
    }
    void shuffle() {
        for(int i = 0; i < cards.length; i++) {
            int rIdx = (int)(Math.random() *  cards.length);
            if(i == rIdx) {
                continue;
            }
            Card temp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = temp;
        }
    }
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
    /*
    오류가 발생하는 이유는 Card 클래스에 매개변수 없는 기본 생성자(default constructor)가 없기 때문
    코드를 보면, Card 클래스에는 String kind와 String number를 매개변수로 받는 생성자만 정의되어 있습니다.

    Java에서 클래스에 생성자를 명시적으로 정의하면
    컴파일러는 기본 생성자를 자동으로 추가하지 않습니다.
    Card c = new Card();와 같이 매개변수 없이 객체를 생성하려고 하면,
    매칭되는 생성자가 없어 컴파일 오류가 발생합니다

    해결 -> 기본 생성자 추가
    Card 클래스에 기본 생성자를 명시적으로 추가하는 방법. 이렇게 하면 매개변수 없이 Card 객체를 생성할 수 있습니다.
     */

    /*또 다른 해결 방안 -> 객체 생성 시 매개변수 전달
    for(int i = 0; i < kinds.length; i++) {
        for(int j = 1; j <= 13; j++) {
            String number = switch(j) {
                case 1 -> "A";
                case 11 -> "J";
                case 12 -> "Q";
                case 13 -> "K";
                default -> String.valueOf(j);
            };
            // 생성자에 매개변수 전달
            Card c = new Card(kinds[i], number);
            cards[idx++] = c;
        }
    }
    */
    Card(String kind, String number) {
        this.kind = kind;
        this.number = number;
    }
    Card() {

    }
    @Override
    public String toString() {
        return String.format("%s(%s)", kind, number);
    }       //오버라이딩
}