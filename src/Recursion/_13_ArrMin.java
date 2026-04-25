package Recursion;

public class _13_ArrMin {
    public static void main(String[] args) {
        int[] arr = {5,2,9,1};
        System.out.println(min(arr, 0));
    }
    public static int min(int[] arr, int i){
        if(i == arr.length - 1){
            return arr[i];
        }
        int minCheck = min(arr, i + 1);
        return Math.min(arr[i], minCheck);
    }
}
