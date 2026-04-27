package Recursion;

public class _14_LinearSearch {
    public static void main(String[] args) {
        //return the index of the target
        int[] arr = {4,7,2,9};
        System.out.println(search(arr, 0, 2));
    }
    public static int search(int[] arr, int i, int target){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return search(arr, i + 1, target);
    }
}
