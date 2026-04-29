package Recursion;

public class _31_RemoveDuplicates {
    //this problem is best through iterative way and recursion is just for practice and better understanding
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        duplicates(arr, 0);
    }
    public static void duplicates(int[] arr, int i){
        if(i == arr.length - 1){
            System.out.print(arr[i]);
            return;
        }
        if(arr[i] != arr[i + 1]){
            System.out.print(arr[i]+" ");
        }
        duplicates(arr, i + 1);
    }
}
