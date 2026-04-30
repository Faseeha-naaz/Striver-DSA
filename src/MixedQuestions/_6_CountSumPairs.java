package MixedQuestions;

import java.util.Arrays;

public class _6_CountSumPairs {
    public static void main(String[] args) {
        //count pairs with given sum       ----->>>> Two Pointers practice
        int[] arr = {1,2,3,4,5};
        int target = 6;    //output -> (1,5), (2,4)
        countSum(arr, 6);
    }
    public static void countSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.print("(" +arr[left]+ ", " +arr[right]+ ")");
                left++;
                right--;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
    }
}
