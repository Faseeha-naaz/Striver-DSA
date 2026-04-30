package MixedQuestions;

public class _2_SumEvenIndex {
    public static void main(String[] args) {
        //sum of elements at even index
        int[] arr = {1,2,3,4};   // -> output: 1 + 3 = 4

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){   //check even index
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}
