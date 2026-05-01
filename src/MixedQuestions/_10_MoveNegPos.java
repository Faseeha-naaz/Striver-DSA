package MixedQuestions;

import java.util.Arrays;

public class _10_MoveNegPos {
    public static void main(String[] args) {
        //move negative numbers to left, positives to right
        int[] arr = {1, -2, 3, -4, 5};
        int left = 0, right = arr.length - 1;

        while(left < right){
            if(arr[left] < 0){
                left++;
            }
            else if(arr[right] > 0){
                right--;
            }
            else{  //if left is positive and right is negative
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;               //After fixing positions → always move pointers
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
