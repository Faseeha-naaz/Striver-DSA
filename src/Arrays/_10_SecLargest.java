package Arrays;

public class _10_SecLargest {
    public static void main(String[] args) {
        //find second largest element in an array
        int[] arr = {1,4,9,7,11};
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                sec_max = max;     //old max becomes second max
                max = arr[i];      //current number becomes new max
            }
            else if(arr[i] > sec_max && arr[i] != max){
                sec_max = arr[i];
            }
        }
        System.out.println("First largest number is: "+max);
        System.out.println("Second largest number is: "+sec_max);
    }
}
