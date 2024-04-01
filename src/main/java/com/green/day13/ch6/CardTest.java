package com.green.day13.ch6;

public class CardTest {
    public static void main(String[] args) {
        // 카드객체 52

        String[] shapes = { "Heart", "Diamond", "Clova", "Spade"};
        Card[] cards = new Card[52]; // Card[][] card2 = new Card[4][13]; 또한 가능 단 뽑을때 어려움

        int idx = 0;
        for(int i = 0; i < shapes.length; i++) {
            for(int j = 1; j <= 13; j++) {
                Card c = new Card();
//                cards[idx++] = c;
                c.shape = shapes[i];
                c.number = switch(j) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(j);
                    /*
                    String.valueOf 메소드는 자바에서 다양한 타입의 데이터를 문자열(String)로 변환하는데 사용됩니다.
                    이 메소드는 오버로딩되어 있어서, 기본 자료형 또는 객체를 인수로 받을 수 있습니다.
                    인수로 받은 데이터를 문자열로 변환하여 반환하는 것이 주된 기능입니다.
                    이 메소드는 null 값을 인수로 받는 경우에도 안전하게 작동합니다
                    null 값을 입력하면 "null"이라는 문자열이 반환됩니다.
                     */
                };
                cards[idx++] = c;
//                System.out.println(idx++);
            }
        }
        System.out.println("-------------------------");
        for(Card c : cards) {
            System.out.printf("%s(%s)\n", c.shape, c.number);
        }

    }
}
