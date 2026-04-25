package Recursion;

public class _11_ArrayMax {
    public static void main(String[] args) {
        int[] arr = {3,9,2,7};
        System.out.println(maximum(arr, 0));
    }
    public static int maximum(int[] arr, int i){
        if(i == arr.length - 1){
            return arr[i];
        }
        int maxRest = maximum(arr, i +1);
        return Math.max(arr[i], maxRest);
    }
}
