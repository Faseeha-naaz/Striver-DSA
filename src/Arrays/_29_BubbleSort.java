package Arrays;

import java.util.Arrays;

public class _29_BubbleSort {
    public static void main(String[] args) {
        //It is the simplest algorithm that works by simply swapping the adjacent elements if they are in wrong order
        int[] arr = {4, 2, 1, 3};
        for (int i = 0; i < arr.length; i++) { //n - 1 times
            boolean swapped = false;  //better for sorted array
            for(int j = 1; j < arr.length - i; j++){  //Why - i in Inner Loop?
                //After each pass, last elements are already sorted.
                //So no need to compare them again.
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){   //use swapped to reduce unnecessary passes when array is already sorted..better for sorted array
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
