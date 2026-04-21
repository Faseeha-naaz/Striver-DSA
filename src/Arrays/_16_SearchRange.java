package Arrays;

public class _16_SearchRange {
    public static void main(String[] args) {
        //Search an element in range
        int[] arr = {18, 12, -7, 3, 14, 1, 28};
        int target = 14;
        int start = 1, end = 4;

        boolean found = false;
        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                System.out.println("Found at: "+i);
                found = true;
                break;
            }
        }
        if(found == false){
            System.out.println("Not found");
        }
    }
}
