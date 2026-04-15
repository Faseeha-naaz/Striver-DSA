package Patterns;

public class Pattern14 {
    public static void main(String[] args) {
//           *
//          * *
//         * * *
//        * * * *

        int n = 4;
        for(int row = 1; row <= n; row++){
            //print spaces
            for(int space = 1; space <= n - row; space++){
                System.out.print(" ");
            }
            //print stars
            for(int stars = 1; stars <= row; stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
