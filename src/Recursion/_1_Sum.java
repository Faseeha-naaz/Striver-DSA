package Recursion;

public class _1_Sum {
    public static void main(String[] args) {
        //print sum of 1 to n
        System.out.println(add(5));
    }
    public static int add(int n){
        if(n == 1){
            return 1;     //base case
        }
        else{
            return n + add(n - 1);    //recursive case
        }
    }
}
