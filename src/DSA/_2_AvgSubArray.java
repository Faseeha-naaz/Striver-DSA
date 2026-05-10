package DSA;

public class _2_AvgSubArray {
    public static void main(String[] args) {
        //find the average of every sub array of size k
        int[] arr = {1,3,2,6,-1,4,1,8,2};
        int k = 5;
        int windowSum = 0;
        //first window
        for(int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
        }
        //print first average
        System.out.println((double) windowSum / k);

        //slide the window
        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[i - k] + arr[i];
            double avg = (double) windowSum / k;
            System.out.println(avg);
        }
    }
}
