package com.green.day27.ioc;

import com.green.day27.Tv;

public class TvTest {
    public static void main(String[] args) {
        TvFactory tvFactory = TvFactory.getInstance();
        String tvName = "lg";                                               // 제품을 변경하고 싶으면
        String speakerName = "genelec";                                     // " " 안의 값만 변경하면 된다
        String wooferName = "hanil";                                        // 이것이 ioc
        Tv tv = tvFactory.factory(tvName, speakerName, wooferName);
        tv.sound();
    }
}
