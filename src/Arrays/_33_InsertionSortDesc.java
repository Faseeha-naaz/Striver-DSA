package Arrays;

import java.util.Arrays;

public class _33_InsertionSortDesc {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2};
        int swaps = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] > arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swaps++;  //just to know no. of swaps
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(swaps);
    }
}
