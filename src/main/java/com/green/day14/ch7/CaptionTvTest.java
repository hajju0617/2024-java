package com.green.day14.ch7;

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();
        cTv.channel = 10;
        cTv.power();
        cTv.channelUp();
        cTv.channelDown();
        cTv.channelDown();
        System.out.printf("cTv.channel : " + cTv.channel);
        System.out.println();
        cTv.caption = true;
        cTv.displayCaption("dddddd");
    }
}

class Tv {  //부모클래스
    boolean power;
    int channel;

    void power()       { power = !power; }
    void channelUp()   { channel++; }
    void channelDown() { channel--; }
}

class VideoTv extends Tv {

}
class CaptionTv extends Tv {    // 자식클래스 (상속 키워드 : extends)
    boolean caption;    //디폴트 값 false
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}