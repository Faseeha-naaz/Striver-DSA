package Arrays;

public class _6_AverageArr {
    public static void main(String[] args) {
        //find average of all elements
        int[] arr = {1,2,3,4,7,7};
        int sum = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        //for integers use int or to handle decimal values use doubt avg = (double) sum / n
        int avg = sum / n;
        System.out.println(avg);
    }
}
