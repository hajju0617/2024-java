package com.green.day19.blackjack;

public class Card {
    private String pattern; // 무늬
    private String denomination;    // A, 2~10 , J, Q, K
    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }
    public String getPattern() { return pattern; }
    public String getDenomination() { return denomination; }
    @Override
    public String toString() {
        return String.format("%s(%s)", this.pattern, this.denomination);
    }
    public int getScore() {
        return switch(denomination) {
            case "10","J","Q","K" -> 10;
            case "A" -> 1;
            default -> Integer.parseInt(denomination);
        };
    }

}

class CardTest {
    public static void main(String[] args) {
        Card c = new Card("Spade", "9");
        String pattern = c.getPattern();
        String denomination = c.getDenomination();
        System.out.println(c);      // println은 문자열을 출력하는데 c는 객체의 참조 변수이다. Object 에 정의된 toString 을 사용
                                    // -> 오버라이딩으로 toString의 내용을 변경해줌
//        System.out.println(c.toString());
        System.out.println("------");
        int score = c.getScore();
    }
}
