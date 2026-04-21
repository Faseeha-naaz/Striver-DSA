package Arrays;

public class _19_BSCountLoops {
    public static void main(String[] args) {
        //Find how many iterations the while loop took before result.
        //Shows how efficient binary search is.
        //For large arrays:
        //100 elements → few loops
        //1000 elements → around 10 loops
        //1,000,000 elements → around 20 loops

        int[] arr = {10,20,30,40,50};
        int target = 40;
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;

        int count = 0;
        while(start <= end){
            count++;   //place it here to count every loop, bcz we need all the entries
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                System.out.println(target + " found at index: "+ mid);
                found = true;
                break;
            }
            else if(target > arr[mid]){
                start =  mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println("Loops: "+ count);
        if(found == false){
            System.out.println("Not found");
        }
    }
}
