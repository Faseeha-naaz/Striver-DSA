package Recursion;

public class _25_SecondMax {
    static int max = Integer.MIN_VALUE;
    static int sec_max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int[] arr = {8,1,6};
        System.out.println(sec_maximum(arr, 0));
    }
    public static int sec_maximum(int[] arr, int i){
        if(i == arr.length){
            return sec_max;
        }
        if(arr[i] > max){
            sec_max = max;
            max = arr[i];
        }
        else if(arr[i] > sec_max && arr[i] != max){
            sec_max = arr[i];
        }
        return sec_maximum(arr, i + 1);
    }
}
