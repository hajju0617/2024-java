package Study.hajju.ch5;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; // 1,2,3,4,5 (i:0,1,2,3,4)
        }
        System.out.println("[변경전]");
        System.out.println("arr.length : " + arr.length);
        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] : " + arr[i]);
        }
        int[] tmp = new int[arr.length*2];
        for(int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        arr = tmp;

        System.out.println("[변경후]");
    }
}
