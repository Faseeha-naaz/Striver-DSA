package Recursion;

public class _21_TargetContains {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9};
        int target = 7;
        System.out.println(contains(arr, 0, target));
    }
    public static boolean contains(int[] arr, int i, int target){
        if (i == arr.length){
            return false;  //
        }
        if(arr[i] == target){
            return true;
        }
        return contains(arr, i+1, target);
    }
}
