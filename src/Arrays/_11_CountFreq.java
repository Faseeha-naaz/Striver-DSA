package Arrays;

public class _11_CountFreq {
    public static void main(String[] args) {
        //count frequency of a number....[1,2,2,3,2] ... 2 -> 3 times
//        int[] arr = {1,2,2,3,2};
//        int target = 2;
//        int count = 0;
//
//        for(int i = 0; i < arr.length; i++){
//            //System.out.println(arr[i]);
//            if(arr[i] == target){
//                count++;
//            }
//        }
//        System.out.println(target+ "-> " +count + " times");

 //to count all elements frequency
        int[] arr = {1,2,2,3,2,1,4};
        boolean[] visited = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++) {

            if(visited[i] == true){
                continue;
            }

            int count = 1;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " -> " + count + " times");
        }
    }
}
