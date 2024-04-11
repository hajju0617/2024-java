package com.green.day19.blackjack;
import java.util.*;
public class Game {
    private static final int INIT_RECEIVE_CARD_COUNT = 2;
    public void play() {
        System.out.println("======== BlackJack========");
        CardDeck cardDeck = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();

        initPhase(cardDeck, gamer, dealer);
        playingPhase(cardDeck, gamer, dealer);

        System.out.println("gamer : " + gamer.openCards());
        System.out.println("dealer : " + dealer.openCards());

        rule.whoIsWinner(gamer, dealer);


    }
    private void playingPhase(final CardDeck cardDeck, final Gamer gamer, Dealer dealer) {
        Scanner scan = new Scanner(System.in);

        // 게이머가 0을 입력할 때까지 카드를 뽑는다. (게이머가 카드 객체 주소값 추가로 저장)
        while(true) {
            System.out.println(gamer.openCards());
            System.out.print("카드를 뽑겠습니까?? (종료를 원하시면 0을 입력하세요 ->)");
            String input = scan.nextLine();

            if("0".equals(input)) {
                System.out.println("0이 입력 되어 종료 됩니다.");
                break;
            }
            gamer.receiveCard(cardDeck.draw());
            System.out.println("뽑았습니다");
        }
        scan.close();
    }
    private void initPhase(final CardDeck cardDeck, final Gamer gamer, final Dealer dealer) {
        System.out.println("처음 2장의 카드를 각자 뽑겠습니다.");
        for(int i = 0; i < INIT_RECEIVE_CARD_COUNT; i++) {
//            Card c = cardDeck.draw();
//            gamer.receiveCard(c);     두 문장을 아래의 한 문장으로 줄임 (코드는 간략 하지만 가독성이 떨어질 수 있음)
            gamer.receiveCard(cardDeck.draw());

            dealer.receiveCard(cardDeck.draw());
        }
        //딜러가 16점 이하면 카드 한장 더 받을 수 있도록 처리
        while(dealer.isMoreReceiveCard()) {
            dealer.receiveCard(cardDeck.draw());
        }
    }
    public static void main(String[] args) {
    }
}
