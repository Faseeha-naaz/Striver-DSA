package Recursion;

public class _23_FirstNegative {
    public static void main(String[] args) {
        int[] arr = {4,7,-2,5};
        System.out.println(firstNeg(arr, 0));
    }
    public static int firstNeg(int[] arr, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] < 0){
            return i;
        }
        return firstNeg(arr, i +1);
    }
}
