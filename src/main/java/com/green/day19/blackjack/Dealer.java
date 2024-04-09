package com.green.day19.blackjack;
import java.util.*;
public class Dealer extends Gamer {
    private static final int CAN_RECEIVE_POINT = 16; // 16 이하면 카드 한장 더 가져옴
    public boolean isMoreReceiveCard() {
        int sum = 0;
        for(Card card : cards) {
            sum += card.getScore();
        }
        return (sum > CAN_RECEIVE_POINT);
    }
}
class DealerTest {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.receiveCard(new Card("Heart", "A"));
        dealer.receiveCard(new Card("Spade", "K"));
        boolean answer = dealer.isMoreReceiveCard();
        System.out.println(answer);
    }
}
