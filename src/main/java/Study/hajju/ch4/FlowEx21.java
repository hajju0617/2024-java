package Study.hajju.ch4;

import com.green.day3.P;

public class FlowEx21 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                if (i==j) {
                    System.out.printf("[%d,%d]", i,j);
                } else {
                    System.out.printf("%5c", ' '); // 공백 채워주기
                }

            }
            System.out.println();

        }
    }
}
