package com.green.day27.nonioc;

import com.green.day27.Speaker;
import com.green.day27.Tv;

public class SamsungTv implements Tv {      //추상메소드를 상속받으면 반드시 구현해야 됨.

    private Speaker speaker;

    public SamsungTv() {
//        this.speaker = new HarmanSpeaker();       // HarmanSpeaker에서
        this.speaker = new JblSpeaker();            // JblSpeaker로 바꿔줌  ------> nonioc에서는 코드 수정이 필요함
    }

    @Override
    public void sound() {
        System.out.println("SamsungTv : 소리가 난다.");
        speaker.sound();
    }
}
