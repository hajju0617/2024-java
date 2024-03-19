package com.green.day4;

public class MissionSumEvenForLoop {
    public static void main(String[] args) {
        int i,sum=0;

        for(i=1; i<=100; i++) {
            if(i % 2 ==0 ) {
                sum = sum + i;
            }
        }
        System.out.print(sum);
    }
}
