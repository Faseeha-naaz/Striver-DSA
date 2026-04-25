package Recursion;

public class _19_SumArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,1};
        System.out.println(sum(arr, 0));
    }
    public static int sum(int[] arr, int i){
        if(i == arr.length){
            return 0;
        }
        return arr[i] + sum(arr, i + 1);
    }
}
