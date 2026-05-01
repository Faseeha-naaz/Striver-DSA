package MixedQuestions;

import java.util.Arrays;

public class _11_SumTargetTrue {
    public static void main(String[] args) {
        //check if there exists a pair whose sum = target.
        //Input:  arr = [1,2,3,4,6], target = 6
        //Output: true   (because 2 + 4 = 6)

        int[] arr = {1,2,3,9};
        int target = 6;
        System.out.println(check(arr, target, 0, arr.length - 1));
    }
    public static boolean check(int[] arr, int target, int left, int right){
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return true;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
}
