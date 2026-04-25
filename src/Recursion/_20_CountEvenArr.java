package Recursion;

public class _20_CountEvenArr {
    public static void main(String[] args) {
        int[] arr = {2,5,8,7,10};
        System.out.println(count(arr, 0));
    }
    public static int count(int[] arr, int i){
        if(i == arr.length){
            return 0;
        }
        if(arr[i] % 2 == 0){
            return 1 + count(arr, i+1);
        }
        return count(arr, i+1);
    }
}
