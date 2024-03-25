package com.green.day8.ch4;

public class FlowEx26 {
    public static void main(String[] args) {
        int num = 0, sum = 0;

        while(true) {
            num++;
            sum += num;

            if(sum > 100) {
                break;
            }
            System.out.println(num);
        }
        System.out.println("sum = " + sum);
        //System.out.println("num = " + num);


    }
}
