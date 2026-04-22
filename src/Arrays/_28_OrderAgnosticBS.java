package Arrays;

public class _28_OrderAgnosticBS {
    public static void main(String[] args) {
        //when you don't know array is ascending or descending, first check
        int[] arr = {10,20,30,40,50};
        int target = 40;
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                System.out.println("Target found at index: "+ mid);
                return;
            }
            if(isAsc){
                if(target > arr[mid]){     //Ascending
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if(target > arr[mid]){      //Descending
                    end = mid - 1;
                }
                else{
                    start =  mid + 1;
                }
            }
        }
        System.out.println("Not found");
    }
}
