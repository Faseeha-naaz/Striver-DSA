package Arrays;

public class _9_ReverseArr {
    public static void main(String[] args) {
        //print reverse array
//        int[] arr = {1,2,3,4,5};
//
//        for(int i = arr.length - 1; i >= 0; i--){
//            System.out.print(arr[i]+" ");
//        }


//The above method prints reverse order, but does not actually reverse the array in memory.
//Reverse Array using Swapping (Actual Reverse)
        int[] arr = {1,2,3,4,5};
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
