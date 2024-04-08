package com.green.day18;

public class NumberBaseBallGameTest {
    public static void main(String[] args) {
        NumberBaseBallGame game = new NumberBaseBallGame(3);
    }
}

class NumberBaseBallGame {
    static final int MIN_NUMBER = 1;
    static final int DEFAULT_NUMBER = 3;
    static final int MAX_NUMBER = 9;
    final int NUMBER_COUNT;
    private int[] numArr;
    NumberBaseBallGame(final int NUMBER_COUNT) {
        if(NUMBER_COUNT < 1 || NUMBER_COUNT > 9) {
            this.NUMBER_COUNT = DEFAULT_NUMBER;
        } else {
            this.NUMBER_COUNT = NUMBER_COUNT;
        }
        this.NUMBER_COUNT = NUMBER_COUNT;
        this.init();
    }
    private void init() {
        this.numArr = new int[NUMBER_COUNT];

        for(int i = 0; i < this.numArr.length; i++) {
            int val = (int)((Math.random() * 9) + 1);
            numArr[i] = val;
            for(int j = 0; j < i; j++) {
                if(numArr[j] == val) {
                    i--;
                    break;
                }
            }
        }
    }   //init
    private int getRandomValue() {
        return (int)((Math.random() * MAX_NUMBER) + MIN_NUMBER);
    }
    public void showArr() {

    }
}