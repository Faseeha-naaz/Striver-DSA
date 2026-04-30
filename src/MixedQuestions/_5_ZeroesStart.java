package MixedQuestions;

import java.util.Arrays;

public class _5_ZeroesStart {
    public static void main(String[] args) {
        //Move Zeroes to start ---> just to practice two pointers more
        int[] arr = {1,0,2,0,3,0};
        int start = arr.length - 1;

        for(int i = arr.length - 1; i >= 0; i--){   //reverse loop
            if(arr[i] != 0){
                arr[start] = arr[i];                //change condition, print at end
                start--;
            }
        }
        //fill remaining position with 0
        for(int i = 0; i <= start; i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
