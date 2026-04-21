package Arrays;

public class _23_SearchInsert {
    public static void main(String[] args) {
        //Search Insert Position
        //Array: {10,20,30,40}..... Target = 25....Output: 2....Meaning insert at index 2

        int[] arr = {10,20,30,40};
        int target = 25;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;  //mid = 20
            if(arr[mid] == target){
                System.out.println("Position: "+mid);
                return;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        //if not found
        System.out.println("Insert position: "+start);
    }
}
