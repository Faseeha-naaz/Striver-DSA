package DSA;

public class _5_MaxSumSubArr {
    public static void main(String[] args) {
        //find maximum sum sub array of size k
        //output: max sum = 9, sub array = [5,1,3]
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        int windowSum = 0;
        for(int i = 0; i < k; i++){
            windowSum = windowSum + arr[i];
        }
        int maxSum = windowSum;
        int startIndex = 0;
        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[i - k] + arr[i];
            if(windowSum > maxSum){
                maxSum = windowSum;
                startIndex = i - k + 1;   //to find start index from end
            }
        }
        for(int i = startIndex; i < startIndex + k; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
