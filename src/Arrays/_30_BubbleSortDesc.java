package Arrays;

import java.util.Arrays;

public class _30_BubbleSortDesc {
    public static void main(String[] args) {
        //{4,2,3,1} ======= {4,3,2,1}
        int[] arr = {4,2,3,1};
        int swaps = 0;
        for(int i = 0; i < arr.length; i++){
            boolean swapped = false;
            //for optimization
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] > arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                    swaps++;   //for counting no of swaps done (just for practice)
                }
            }
            if(swapped == false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Total swaps: "+ swaps);
    }
}
