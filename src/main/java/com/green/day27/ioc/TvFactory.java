package com.green.day27.ioc;

import com.green.day27.*;

public class TvFactory {
    private static TvFactory tvFactory;

    public static TvFactory getInstance() {     // getInstance() 는 객체를 싱글톤(Singleton)으로 생성하고 반환하는 메소드. (객체를 하나만 생성)
        if(tvFactory == null) {                 // 싱글톤 패턴은 프로그램에서 하나의 인스턴스만 생성하고, 해당 인스턴스를 전역적으로 접근할 수 있도록 하는 디자인 패턴입니다.
            tvFactory = new TvFactory();        //getInstance() 메소드는 주로 싱글톤 디자인 패턴(Singleton Design Pattern)에서 사용되는 메소드입니다.
        }
        return tvFactory;
    }



    public static Tv factory(String tvName, String speakerName, String wooferName) {
        Woofer woofer = switch (wooferName) {
            case "hanil" -> new HanilWoofer();
            case "marten" -> new MartenWoofer();
            default -> null;
        };
        Speaker speaker = switch (speakerName) {
            case "bose" -> new BoseSpeaker(woofer);
            case "genelec" -> new GenelecSpeaker(woofer);
            default -> null;
        };
        Tv tv = switch (tvName) {
            case "lg" -> new LgTv(speaker);
            case "apple" -> new AppleTv(speaker);
            default -> null;
        };
        return tv;
    }
}
