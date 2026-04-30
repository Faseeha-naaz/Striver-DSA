package MixedQuestions;

import java.util.Arrays;

public class _4_ZeroesEnd {
    public static void main(String[] args) {
        //Move all zeroes to end -------------->>>>>>>>>> TWO POINTER PROBLEM ****
        //Instead of thinking: “move zeroes to end”
        //Think: “push all non-zero elements forward”
        //Zeroes will automatically go to the end
        int[] arr = {1,0,2,0,3};
        int end = 0;  //tells where the next non-zero should go
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                //swap arr[i] with  arr[end]
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
