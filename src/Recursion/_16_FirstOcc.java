package Recursion;

public class _16_FirstOcc {
    public static void main(String[] args) {
        //find the first occurrence of target using linear search
        int[] arr = {1,2,3,2,4,2};
        int target = 2;
        System.out.println(first(arr, 0, target));
    }
    public static int first(int[] arr, int i, int target){
        if(i == arr.length){
            return - 1;
        }
        if(arr[i] == target){
            return i;
        }
        return first(arr, i + 1, target);
    }
}
