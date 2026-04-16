package Basics;

public class _26_SumFibonacci {
    public static void main(String[] args) {
        //print sum of fibonacci numbers till n

        int n = 5;   //n = 5 -> 0,1,1,2,3 , sum = 7
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + a;

            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.print(sum+" ");
    }
}
