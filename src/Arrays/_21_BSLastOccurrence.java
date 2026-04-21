package Arrays;

public class _21_BSLastOccurrence {
    public static void main(String[] args) {
        //find the last occurrence of target
        int[] arr = {10,20,20,20,30,40};    // output: 3
        int target = 20;
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ans = mid;
                start = mid + 1;   //move right
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        if(ans != -1){
            System.out.println("Last occurrence of "+ target+ " found at index: "+ ans);
        }
        else{
            System.out.println("Target not found");
        }

    }
}
