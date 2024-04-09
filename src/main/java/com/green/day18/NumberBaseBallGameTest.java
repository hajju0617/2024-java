package com.green.day18;

import java.util.Arrays;
import java.util.*;

public class NumberBaseBallGameTest {
    public static void main(String[] args) {
        NumberBaseBallGame game = new NumberBaseBallGame(3);
        game.showArr();
        game.start();
    }
}

class NumberBaseBallGame {
    static final int MIN_NUMBER = 1;
    static final int DEFAULT_NUMBER = 3;
    static final int MAX_NUMBER = 9;
    final int NUMBER_COUNT;
    private int[] numArr;
    NumberBaseBallGame(final int NUMBER_COUNT) {
        if(NUMBER_COUNT < 1 || NUMBER_COUNT > MAX_NUMBER) {
            this.NUMBER_COUNT = DEFAULT_NUMBER;
        } else {
            this.NUMBER_COUNT = NUMBER_COUNT;
        }
        this.init();
    }
    private void init() {
        this.numArr = new int[NUMBER_COUNT];
        Main:
        for(int i = 0; i < this.numArr.length; i++) {
            int val = getRandomValue();
            for(int j = 0; j < i; j++) {
                if(this.numArr[j] == val) {
                    i--;
                    continue Main;
                }
            }
            this.numArr[i] = val;
        }
    }   //init
    private int getRandomValue() {
        return (int)((Math.random() * MAX_NUMBER) + MIN_NUMBER);
    }
    public void showArr() {
        System.out.println(Arrays.toString(this.numArr));
    }
    void start() {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.printf("숫자를 %d개 입력해 주세요. (구분은 스페이스) -> ", NUMBER_COUNT);
            String strAnswer = scan.nextLine();
            String[] answerStrArr = strAnswer.split(" ");   // 스페이스바를 기준으로 숫자 하나씩으로 나눔 -> "1 2 3" => {"1","2","3"}
            int[] answerArr = new int[answerStrArr.length];
            for(int i = 0; i < answerArr.length; i++) {
                answerArr[i] = Integer.parseInt(answerStrArr[i]);
            }
            if (numArr.length != answerArr.length) {
                System.out.println("잘못 입력 하셨습니다.");
                continue;
            }
            int striker = 0, ball = 0;
            for(int i = 0; i < answerArr.length; i++) {
                for(int j = 0; j < answerArr.length; j++) {
                    if(answerArr[i] == numArr[j]) {
                        if (answerArr[i] == numArr[i]){
                            striker++;
                        } else {
                            ball++;
                        }
                    }

                }   // 안

            }   // 밖
            if(striker == NUMBER_COUNT) {
                System.out.println("정답!!");
                break;
            }
            System.out.printf("striker = %d, ball = %d, out = %d\n", striker, ball, (NUMBER_COUNT - (striker + ball)));
//            System.out.println(Arrays.toString(answerArr));

        }   //while
        scan.close();
    }
}