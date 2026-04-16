package Basics;

public class _22_Fibonacci {
    public static void main(String[] args) {
        //print all the fibinacci series from 1 to 5 - > 0, 1, 1, 2, 3
        int n = 5;
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i++){
            System.out.print(a+" ");   //print inside loop for series of values
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
