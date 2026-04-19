package Arrays;

public class _4_MaxArray {
    public static void main(String[] args) {
        //find maximum element in an array
        int[] arr = {1,2,3,44,5};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
