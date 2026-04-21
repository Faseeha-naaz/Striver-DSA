package Arrays;

public class _27_BSDescending {
    public static void main(String[] args) {
        //reverse of ascending order binary search  -> move right then left
        int[] arr = {50,40,30,20,10};
        int target = 20;
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                System.out.println(mid);
                found = true;
                break;
            }
            else if(target > arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        if(found == false){
            System.out.println("Target Not found");
        }
    }
}
