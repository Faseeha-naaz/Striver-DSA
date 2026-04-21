package Arrays;

public class _13_LSFirstOccurrence {
    public static void main(String[] args) {
        //find the first occurrence of 8 in an array

        int[] arr = {3,8,2,8,9};   //first occurrence of 8 is at index 1
        int target = 8;
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(target + " is at " + i + " position");
                found = true;
                break;
            }
        }
        if(found == false){
            System.out.println("Not found");
        }
    }
}
