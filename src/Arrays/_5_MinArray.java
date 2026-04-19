package Arrays;

public class _5_MinArray {
    public static void main(String[] args) {
        //find min element in an array
        int[] arr = {1,2,-3,0,-1};
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
