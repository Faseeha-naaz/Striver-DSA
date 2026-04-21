package Arrays;

public class _14_LSLastOccurrence {
    public static void main(String[] args) {
        //find the last index of the target
        int[] arr = {3,8,2,8,9};
        int target = 8;
        boolean found = false;

        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == target){
                found = true;
                System.out.println(target + " found at index: "+ i);
                break;
            }
        }
        if(found == false){
            System.out.println("Not found");
        }
    }
}
