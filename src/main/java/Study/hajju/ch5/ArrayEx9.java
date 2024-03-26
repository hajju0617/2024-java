package Study.hajju.ch5;
import java.util.*;
public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int tmp = (int)(Math.random() * code.length); //0 <= random < 1 -> 0 <= random <5 (0,1,2,3,4)
            arr[i] = code[tmp];
        }
        System.out.println(Arrays.toString(arr));

    }//main
}
