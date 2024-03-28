package com.green.day11.ch6;

public class TvTest4 {
    public static void main(String[] args) {
//        Tv tv = new Tv();

        Tv[] tvArr = new Tv[3];
        for(int i =0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
        }

        for(int i =0; i < tvArr.length; i++) {
            System.out.println(tvArr[i]);
        }
//        for(Tv tmp : tvArr) {           향상된 for 문
//            System.out.println(tmp);
//        }

        // 0번방 채널11, 1번방 채널12, 2번방 채널13
        for(int i = 0; i < tvArr.length; i++) {
            tvArr[i].channel = i + 10;
            tvArr[i].channelUp();

            System.out.printf("tvArr[] = %d\n", tvArr[i].channel);
        }
        System.out.println("-----------------------------");
        //하단은 향상된 for 문 (foreach)
        int channel = 11;
        for(Tv tv : tvArr) {
            tv.channel = channel++;
        }
        for(int i = 0; i < tvArr.length; i++) {
            System.out.printf("tvArr[] = %d\n", tvArr[i].channel);
        }





    }//main
}
