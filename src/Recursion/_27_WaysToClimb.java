package Recursion;

public class _27_WaysToClimb {
    public static void main(String[] args) {
        //You are standing at the bottom of stairs.
        //There are n steps to reach the top.
        //You can move only:
        //1 step at a time
        //or
        //2 steps at a time
        System.out.println(ways(5));
    }
    public static int ways(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return ways(n - 1) + ways(n - 2);
    }
}
