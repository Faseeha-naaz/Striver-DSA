package DSA;

public class _6_FirstNeg {
    public static void main(String[] args) {
        //first negative number in a range k
        int[] arr = {12,-1,-7,8,-15,30,16,28};
        int k = 3;

        for(int i = 0; i <= arr.length - k; i++){
            int negNum = 0;
            for(int j = i; j < i + k; j++){
                if(arr[j] < 0){
                    negNum = arr[j];
                    break;
                }
            }
            System.out.println(negNum);
        }
    }
}
