package DSA;

public class _4_SmallSubarrSum {
    public static void main(String[] args) {
        //smallest sub array with sum >= S
        int[] arr = {2,1,5,2,3,2};
        int S = 7;      //output: 2 bcz [5,2] = 7, length = 2
        //window size changes dynamically  ------> variable sliding window technique
        int windowSum = 0;
        int windowStart = 0;
        int minLength = Integer.MAX_VALUE;
        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
            //expand window
            windowSum = windowSum + arr[windowEnd];
            //shrink window
            while (windowSum >= S){
                int currentLen = windowEnd - windowStart + 1;
                minLength = Math.min(minLength, currentLen);
                windowSum = windowSum - arr[windowStart];
                windowStart++;
            }
        }
        System.out.println(minLength);
    }
}
