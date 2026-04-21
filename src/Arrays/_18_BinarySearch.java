package Arrays;

public class _18_BinarySearch {
    public static void main(String[] args) {
        //search for a target in a sorted array
        int[] arr = {10,20,30,40,50};
        int target = 40;
        boolean found = false;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                System.out.println(target + " found at index: "+ mid);
                found = true;
                break;
            }
            else if(target > arr[mid]){
                start = mid + 1;       //move right side
            }
            else{
                end = mid - 1;         //move to the left
            }
        }
        if(found == false){
            System.out.println("Not found");
        }
    }
}
