package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
//        * * * *
//        * * *
//        * *
//        *

        int n = 4;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n - row + 1; col++){   //4 - 1 + 1 = 4 stars at first and so on...
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
