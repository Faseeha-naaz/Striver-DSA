package Basics;

public class _24_EvenFibonacci {
    public static void main(String[] args) {
        //print even fibonacci numbers from 1 to n
        int n = 10;    //0,1,1,2,3,5,8,13,21,34    -> even = 2,8,34
        int a = 0;
        int b = 1;

        for(int i = 1; i <= n; i++){
            if(a % 2 == 0){
                System.out.print(a+" ");  //even
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
