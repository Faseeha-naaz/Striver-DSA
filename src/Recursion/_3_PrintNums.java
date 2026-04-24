package Recursion;

public class _3_PrintNums {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        print(n - 1);      //first get number
        System.out.println(n);   //then print
    }
}
