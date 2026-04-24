package Recursion;

public class _4_PrintRevNums {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);      //printing before recursion gives descending order
        print(n - 1);
    }
}
