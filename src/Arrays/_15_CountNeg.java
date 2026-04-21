package Arrays;

public class _15_CountNeg {
    public static void main(String[] args) {
        //count negative numbers
        int[] arr = {4, -2, 7, -9, 1};      //count = 2

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                count++;
            }
        }
        System.out.println("Negative numbers = " + count);
    }
}
