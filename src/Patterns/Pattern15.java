package Patterns;

public class Pattern15 {
    public static void main(String[] args) {
//        * * * *
//         * * *
//          * *
//           *

        int n = 4;
        for(int row = n; row >= 1; row--){
            //print spaces
            for(int spaces = 1; spaces <= n - row; spaces++){
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
