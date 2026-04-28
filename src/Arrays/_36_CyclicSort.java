package Arrays;

import java.util.Arrays;

public class _36_CyclicSort {
    public static void main(String[] args) {
        //Used when array contains numbers in a range like: 1 to n or n to 1
        //We place each number at its correct index.
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;  //place in correct index value
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

//Why Powerful?
//Many problems become easy:
               //Missing Number
               //Duplicate Number
               //First Missing Positive
               //Find All Missing Numbers
