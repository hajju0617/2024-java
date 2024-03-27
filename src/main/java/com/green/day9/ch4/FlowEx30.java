package com.green.day9.ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        int i = 0, sum =0;

        while(sum < 100) {
            i++;
            sum += i;
        }
        System.out.println(i);
        System.out.println(sum);
    }
}
