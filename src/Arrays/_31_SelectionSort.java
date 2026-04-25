package Arrays;

import java.util.Arrays;

public class _31_SelectionSort {
    public static void main(String[] args) {
        //It repeatedly finds the smallest element from the unsorted part and places it at the correct position.
        int[] arr = {5,4,3,1};

        for(int i = 0; i < arr.length - 1; i++){
            //it means i < 3  ---> 0,1,2 then last index 3 automatically becomes correct.
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){ //it means it has to search till last index j = 1,2,3
                //i -> How many spots to fix.
                //j -> How far to search.
                if(arr[j] < arr[minIndex]){
                    minIndex = j;   //here we find the min index value
                }
            }
            //then we swap the smallest element to the correct index position
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
