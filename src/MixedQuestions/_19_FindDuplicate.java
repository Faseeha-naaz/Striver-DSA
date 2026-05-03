package MixedQuestions;

public class _19_FindDuplicate {
    public static void main(String[] args) {
        //find the duplicate number ---> [1,2,3,2] -----> output: 2
        int[] arr = {1, 2, 3, 2};
        //count the frequency, if repeated then its a duplicate
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Duplicate number is: " + arr[i]);
            }
        }
    }
}
