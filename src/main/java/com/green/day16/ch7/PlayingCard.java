package com.green.day16.ch7;

public interface PlayingCard {
    //public static final 자동으로 붙음
    int CLOVER = 1;

    //public abstract 자동으로 붙음
    String getCardNumber();
}

interface DeepPlayingCard extends PlayingCard {
    String getCardKind();
}

class PlayCard implements DeepPlayingCard {     // 인터페이스를 상속받을땐 implements를 적어줌

    @Override
    public String getCardNumber() { return null; }

    @Override
    public String getCardKind() { return null; }
}

class PlayCardTest {
    public static void main(String[] args) {
        PlayingCard pc = new PlayCard();
        pc.getCardNumber();
        DeepPlayingCard dpc = (DeepPlayingCard)pc;
        dpc.getCardKind();
        System.out.println("----------끝----------");
    }
}