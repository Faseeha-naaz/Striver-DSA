package DSA;

public class _3_MaxInWindow {
    public static void main(String[] args) {
        //find the maximum element in every window
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        //using nested loops
        for(int i = 0; i <= arr.length - k; i++){
            int max = arr[i];
            for(int j = i; j < i + k; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            System.out.print(max+" ");
        }
    }
}
