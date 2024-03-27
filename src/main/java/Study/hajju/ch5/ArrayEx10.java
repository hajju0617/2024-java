package Study.hajju.ch5;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i = 0; i < numArr.length; i++) { //length = 10 -> i = 0~9 (10개)
            System.out.print(numArr[i] = (int)(Math.random() *10)); // 0<= random <1 (numArr[0~9] 값 입력받음;
        }
        System.out.println();

        for(int i = 0; i < numArr.length-1; i++) { // length-1 = 9 -> i = 0~8(9개)
            boolean changed = false;

            for(int j = 0; j < numArr.length-1-i; j++) { // 9-i -> i=0일때 j=0~8(9개), i=1일때 j=0~7(8개),,,i=8일때 j=0(1개)
                if(numArr[j] > numArr[j+1]) {
                    int tmp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = tmp;
                    changed = true;
                } //if
            } //for j
            if(!changed) { //자리 안 바꿨다면 break;
                break;
            }
            for(int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);
            }
            System.out.println();
        } // for i
    } //main
}
