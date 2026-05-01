package MixedQuestions;

import java.util.Arrays;

public class _8_RemoveDupli {
    public static void main(String[] args) {
        //Two pointer technique works on sorted arrays
        //Remove duplicates from sorted array (in-place)
        //Input:  [1,1,2,2,3]
        //Output: [1,2,3,_,_]
        //Return length = 3

        int[] arr = {1,1,2,2,3};
        int left = 0;
        for(int right = 1; right < arr.length; right++){
            if(arr[right] != arr[left]){
                left++;
                arr[left] = arr[right];
            }
        }
        for(int i = left + 1; i < arr.length; i++){
            arr[i] = 0;   // or any placeholder .... to place 0's
        }
        System.out.println("Length: " + (left + 1));
        System.out.println(Arrays.toString(arr));
    }
}
