package Arrays;

public class _25_BSCeiling {
    public static void main(String[] args) {
        //Smallest element greater than or equal to target.
        //arr = {10,20,30,40}, target = 25, Output: 30

        int[] arr = {10,20,30,40};
        int target = 25;
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] >= target){
                ans = arr[mid];
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        System.out.println("Ceiling is: "+ans);
    }
}
