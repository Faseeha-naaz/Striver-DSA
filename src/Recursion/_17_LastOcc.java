package Recursion;

public class _17_LastOcc {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2};
        int target = 2;
        System.out.println(last(arr, arr.length - 1, target));
    }
    public static int last(int[] arr, int i, int target){
        if(i < 0){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return last(arr, i - 1, target);
    }
}
