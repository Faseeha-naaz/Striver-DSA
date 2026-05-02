package MixedQuestions;

import java.util.Arrays;

public class _15_MoveEvenOdd {
    public static void main(String[] args) {
        //move even to left, odd to right
        int[] arr = {1,2,3,4,5,6};     //output: [2,4,6,1,5,3]   ...order doesn't matter
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            if(arr[left] % 2 == 0){
                left++;
            }
            else if(arr[right] % 2 != 0){
                right--;
            }
            else{
                //else swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
