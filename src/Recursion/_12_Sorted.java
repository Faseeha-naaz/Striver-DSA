package Recursion;

public class _12_Sorted {
    public static void main(String[] args) {
        //find if array is sorted
        int[] arr = {1,2,33,4};
        System.out.println(check(arr, 0));

    }
    public static boolean check(int[] arr, int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i + 1]){
            return false;
        }
        return check(arr, i + 1);
    }
}
