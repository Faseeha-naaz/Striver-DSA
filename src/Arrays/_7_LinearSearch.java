package Arrays;

public class _7_LinearSearch {
    public static void main(String[] args) {
        //search key in an array  --> linear search
        int[] arr = {1,22,3,44,5};
        int target = 44;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element found at index: "+i);
                found = true;
                break;
            }
        }
        if(found == false){
            System.out.println("Element not found");
        }
    }
}
