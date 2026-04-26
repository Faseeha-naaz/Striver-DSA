package Recursion;

public class _22_StrictlyInc {
    public static void main(String[] args) {
        int[] arr = {1,3,5,9};
        System.out.println(increasing(arr, 0));
    }
    public static boolean increasing(int[] arr, int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i + 1] > arr[i]){
            return increasing(arr, i + 1);
        }
        return false;
    }
}
