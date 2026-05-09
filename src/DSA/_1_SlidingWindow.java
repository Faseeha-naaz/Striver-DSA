package DSA;

public class _1_SlidingWindow {
    public static void main(String[] args) {
        //problem: Maximum sum sub array of size 3
        //Imagine a “window” moving across the array.
        //Instead of recalculating everything again and again, We reuse previous work
        int[] arr = {2,1,5,1,3,2};
        int k = 3; //size of sub array
        int windowSum = 0;
        //first window
        for(int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
        }
        int maxSum = windowSum;
        //slide the window
        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[i - k] + arr[i];   //i - k because, i = 3, k = 3, i - k = 0, arr[0]
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum);
    }
}
//[2 1 5] 1 3 2   sum = 8
//Slide →
//2 [1 5 1] 3 2   sum = 7
//Slide →
//2 1 [5 1 3] 2   sum = 9
//The window keeps moving.