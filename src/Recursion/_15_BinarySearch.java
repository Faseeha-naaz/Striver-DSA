package Recursion;

public class _15_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,13,18,25};
        System.out.println(search(arr, 0, arr.length - 1, 13));
    }
    public static int search(int[] arr, int start, int end, int target){
        if(start > end){
            return - 1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(target > arr[mid]){
            start = mid + 1;
        }
        else{
            end =  mid - 1;
        }
        return search(arr, start, end, target);
    }
}
