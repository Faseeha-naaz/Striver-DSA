package Recursion;

public class _18_CountOcc {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2};
        int target = 2;
        System.out.println(count(arr, 0, target));
    }
    public static int count(int[] arr, int i, int target){
        if(i == arr.length){
            return 0;
        }
        if(arr[i] == target){
            return 1 + count(arr, i+1, target);
        }
        return count(arr, i+1, target);
    }
}
