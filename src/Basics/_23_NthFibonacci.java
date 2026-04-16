package Basics;

public class _23_NthFibonacci {
    public static void main(String[] args) {
        //find nth fibonacci number  -> n = 4, ans = 3  [0,1,1,2,3,5,8,13...]

        int n = 4;
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i++){
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println(a);
    }
}
