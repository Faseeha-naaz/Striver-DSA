package Arrays;

public class _24_BSFloor {
    public static void main(String[] args) {
        //find floor of target   -----> Greatest element less than or equal to target
        //arr = {10,20,30,40}, Target = 25, Floor = 20

        int[] arr = {10,20,30,40};
        int target = 25;
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] <= target){
                ans = arr[mid];
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        System.out.println("Floor is: "+ans);
    }
}
