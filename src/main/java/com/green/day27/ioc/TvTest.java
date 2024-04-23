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

//

//        String tvName = args[0];
//        String speakerName = args[1];   ----> String[] 옆 args를 이용
//        String wooferName = args[2];          1시 방향 Run 옆 화살표 클릭 -> edit configurations -> program arguments 에 값 대입 (스페이스로 구분해서 대입)
    }
}
