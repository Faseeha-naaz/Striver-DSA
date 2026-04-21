package Arrays;

public class _20_BSFirstOccurrence {
    public static void main(String[] args) {
       //Normal Binary Search: Found → stop
       //First Occurrence Binary Search: Found → save index and move left
        int[] arr = {10,20,20,20,30,40};  //sorted array only
        int target = 20;
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ans = mid;
                end = mid - 1;  //move left
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        if(ans != -1){
            System.out.println("First Occurrence of "+ target+ " found at index: "+ ans);
        }
        else{
            System.out.println("Not found");
        }
    }
}
