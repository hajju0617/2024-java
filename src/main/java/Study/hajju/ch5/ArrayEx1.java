package Study.hajju.ch5;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] score = new int[5];
        int k =1;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 70;
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k+2] + score[4];

        for(int i = 0; i<=4; i++) {
            System.out.printf("score[%d] = %d\n", i,score[i]);
        }
        System.out.printf("tmp = %d\n", tmp);
        //System.out.printf("score[%d] = %d\n", 7,score[7]); (배열의 인덱스의 범위를 넘어간 코드)
    }
}
