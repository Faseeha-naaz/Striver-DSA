package Arrays;

public class _12_LSCount {
    public static void main(String[] args) {
        //Medium level linear search question
        //search and count how many times 5 appears
        int[] arr = {5,2,5,7,5,9};
        int target = 5;

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        if(count > 0){
            System.out.println(target + " appears: "+ count+ " times");
        }
        else {
            System.out.println("Not found");
        }
    }
}
