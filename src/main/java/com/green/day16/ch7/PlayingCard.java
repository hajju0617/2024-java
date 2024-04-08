package com.green.day16.ch7;

public interface PlayingCard {
    //public static final 자동으로 붙음
    int CLOVER = 1;

    //public abstract 자동으로 붙음
    String getCardNumber();
}

interface DeepPlayingCard extends PlayingCard {     // 클래스 상속받을때 extends
    String getCardKind();
}

class PlayCard implements DeepPlayingCard {     // 클래스가 인터페이스를 상속받을땐 implements를 적어줌

    @Override
    public String getCardNumber() { return null; }

    @Override
    public String getCardKind() { return null; }
}

class PlayCardTest {
    public static void main(String[] args) {
        PlayingCard pc = new PlayCard();        // playingcard 객체의 주소값 + 나를 상속받은 객체의 주소값 + implements 한 객체의 주소값을 담을 수 있음
        pc.getCardNumber();
        DeepPlayingCard dpc = (DeepPlayingCard)pc;
        dpc.getCardKind();
        System.out.println("----------끝----------");
    }
}