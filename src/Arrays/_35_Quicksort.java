package Arrays;

import java.util.Arrays;

public class _35_Quicksort {
    public static void main(String[] args) {
        //Pick a pivot element
        //Put smaller numbers left
        //Put bigger numbers right
        //Then repeat
        int[] arr = {5,4,3,2,1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int low, int high){
        //base condition
        if(low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while(start <= end){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
        //low = 0
        //end = 1
        //start = 3
        //high = 4
        quickSort(arr, low, end);         //sort left
        quickSort(arr, start, high);      //sort right
    }
}
