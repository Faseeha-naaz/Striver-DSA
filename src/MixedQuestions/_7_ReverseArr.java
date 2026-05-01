package MixedQuestions;

import java.util.Arrays;

public class _7_ReverseArr {
    public static void main(String[] args) {
        //Two pointer technique
        //Reverse the array in-place using two pointers.
        //Input:  [1,2,3,4,5]
        //Output: [5,4,3,2,1]

        int[] arr = {1,2,3,4,5};
        int left = 0, right = arr.length - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
