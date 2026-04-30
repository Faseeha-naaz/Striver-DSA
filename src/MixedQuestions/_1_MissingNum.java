package MixedQuestions;

public class _1_MissingNum {
    public static void main(String[] args) {
        //find the missing number
        int[] arr = {1,2,4,5};    //output: 3
        int num = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                num = i + 1;
                break;
            }
        }
        //if no missing present inside the loop, suppose {1,2,3,4} -> output: 5
        if(num == 0){
            num = arr.length + 1;
        }
        System.out.println(num);
    }
}
