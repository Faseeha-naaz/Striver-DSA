package MixedQuestions;

import java.util.Arrays;

public class _14_ReverseFew {
    public static void main(String[] args) {
        //Reverse only a part of array  --> start nd end only
        int[] arr = {1,2,3,4,5};
        int start = 1;
        int end = 3;         //output: [1,4,3,2,5]

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
