package com.green.day4;

public class VarScope {
    public static void main(String[] args) {
        /*변수가 선언되면 감싸고 있는 중괄호가 있다. 그 범위를 벗어나면 x

         */
        // ex
        int num = 20;
        if(1 > 0) {
            //System.out.println(num);

            int num2 = 10;
            System.out.println(num);
        }
        //System.out.println(num);

        if(1 > 0) {
            int num2 = 10; //위 if문에 있는 num2와 같은 이름을 사용할 수 있다
                            //why? 스코프가 다르기 때문

            System.out.println(num2);
        }

        for(int i=0; i<10; i++) {

        } //i의 범위가 이 중괄호까지라서
        //System.out.println(i);
    }

}
