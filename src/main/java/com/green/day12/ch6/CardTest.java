package com.green.day12.ch6;

public class CardTest {
    public static void main(String[] args) {
        System.out.println(Card.width);
        System.out.println(Card.height);

        Card.width = 110;

        System.out.println(Card.width);

        System.out.println("---------------------------");

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;
        System.out.printf("c1.kind : %s, c1.number : %d, c1.width = %d\n", c1.kind, c1.number, c1.width);

        System.out.println("---------------------------");

        System.out.println(c1.width);   //사용은 가능하나 지양하자
        System.out.println(c1.height);  //사용은 가능하나 지양하자

        System.out.println("---------------------------");

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
        c1.width = 200;

        System.out.printf("c2.kind : %s, c2.number : %d\n", c2.kind, c2.number);

        System.out.println("---------------------------");

        System.out.println(c2.width);
        System.out.println(c2.height);

        System.out.println("------------------------");

        System.out.println("c1.width : " + c1.width);
        System.out.println("c2.width : " + c2.width);
        System.out.println("Card.width : " + Card.width);
    }
}
