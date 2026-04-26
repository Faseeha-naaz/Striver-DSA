package Recursion;

public class _24_MaxIndex {
    public static void main(String[] args) {
        int[] arr = {3,9,2,7};
        System.out.println(maximum(arr, 0));
    }
    public static int maximum(int[] arr, int i){
        if(i == arr.length - 1){
            return i;
        }
        int maxAns = maximum(arr, i + 1);
        if(arr[i] > arr[maxAns]){
            return i;
        }
        return maxAns;
    }
}
