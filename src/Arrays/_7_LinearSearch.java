package Arrays;

public class _7_LinearSearch {
    public static void main(String[] args) {
        //search key in an array  --> linear search
        //checking each element one by one from the beginning until you find the target value.
        int[] arr = {1,25,3,44,5};
        int target = 25;
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

//Time Complexity - > Worst case = check all elements = O(n)
//(Simple meaning: more elements = more time)
