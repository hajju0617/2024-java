package com.green.day3;

public class MissionForLoopGugudan {
    public static void main(String[] args) {
        int dan = (int)((Math.random() * 8) +2);

        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "x" + i + "=" + (dan * i));
            // x와 =은 문자 이므로 " "로 표현 해주고 문자열과 붙여주기 위해서 +를 써줌.

            //위와 같은 의미 printf 활용 (System.out.printf("%d x %d = %d\n", dan,i,dan*i);)
        }


        int i,j;
        for(i=1; i<10; i++) {
            for(j=2; j<10; j++) {
                System.out.printf("%3d x %d = %3d", j,i,j*i);

                if (j % 5 == 0) {
                    System.out.println();
                }

            }
        }
    }
}
