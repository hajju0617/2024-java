package com.green.day4;

public class MissionStarTriangle {
    public static void main(String[] args) {
        int star = (int)((Math.random() *5) + 3);
        System.out.println(star);


        for(int i=0; i<star; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int k =1; k<=star; k++) {
            for(int l = 0; l<k; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int a=1; a<=3; a++) {
            for(int b=1; b<4-a; b++) {
                System.out.print(" ");
            }
            for(int b=1; b<=(a*2)-1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        *****
        *****
        *****
        */
    }

}
/*01234
02
11 12 13
20 21 22 23 24

2
234
23456
*/



