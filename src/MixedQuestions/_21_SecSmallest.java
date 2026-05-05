package MixedQuestions;

public class _21_SecSmallest {
    public static void main(String[] args) {
        //find the second smallest number
        int[] arr = {4,2,7,1,3};
        int min = Integer.MAX_VALUE;
        int sec_min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                sec_min = min;
                min = arr[i];
            }
            else if(arr[i] < sec_min && arr[i] != min){
                sec_min = arr[i];
            }
        }
        System.out.println(sec_min);
    }
}
