package com.green.day8.ch4;

public class FlowEx18 {
    public static void main(String[] args) {
        int i,j;
        for(i = 2; i<=9; i++) {
            for(j = 1; j<= 9; j++) {
                System.out.printf("%d x %d = %d\n", i,j,i*j);
            }
            if(i == 9)
                break;
            System.out.println("----");
        }
    }
}
