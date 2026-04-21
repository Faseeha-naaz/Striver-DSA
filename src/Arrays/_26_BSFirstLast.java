package Arrays;

import java.util.Arrays;

public class _26_BSFirstLast {
    public static void main(String[] args) {
        //First and Last Position Together
        //Array: {10,20,20,20,30,40}, Target = 20, Output: [1,3]

        int[] arr = {10, 20, 20, 20, 30, 40};
        int target = 20;
        int f = firstOccur(arr, target);
        int l = lastOccur(arr, target);
        System.out.println(Arrays.toString(new int[] {f, l}));

    }
    public static int firstOccur(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans1 = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ans1 = mid;
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans1;
    }
    public static int lastOccur(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans2 = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ans2 = mid;
                start = mid + 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans2;
    }
}
