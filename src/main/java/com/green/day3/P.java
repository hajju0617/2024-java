package com.green.day3;

public class P {
    public static void main(String[] args) {
        int i,j=0;

        for(i=0; i<5; i++) {
            for(j=0; j<5; j++) {
                if(i == j ) {
                    System.out.print("*");
                } else if (i+j == 4) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
/*
0   0,0     0,4
1   1,1     1,3
2       2,2
3   3,1     3,3
4   4,0     4,4
*/
