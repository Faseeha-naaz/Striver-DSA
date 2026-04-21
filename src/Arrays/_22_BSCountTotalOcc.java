package Arrays;

public class _22_BSCountTotalOcc {
    public static void main(String[] args) {
        //find total occurrences of a target
        int[] arr = {10,20,20,20,30,40};  //output: 3
        int first = firstOcc(arr);
        int last = lastOcc(arr);

        if(first == -1){
            System.out.println(0);
        }
        else{
            System.out.println(last - first + 1);
        }
    }
    public static int firstOcc(int[] arr){
        int target = 20;
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
    public static int lastOcc(int[] arr) {
        int target = 20;
        int start = 0;
        int end = arr.length - 1;
        int ans2 = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans2 = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans2;
    }
}
