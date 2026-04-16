package Basics;

public class _25_CountFibLessN {
    public static void main(String[] args) {
        //count fibonacci numbers less than n value  -> n = 10, count = 7 -> (0,1,1,2,3,5,8)

        int n = 10;
        int a = 0;
        int b = 1;
        int count = 0;

        for(int i = 1; i <= n; i++){
            if(a <= n){
                count++;
            }

            int temp = a + b;
            a = b;
            b = temp;

        }
        System.out.println(count);
    }
}
