package Patterns;

public class Pattern18 {
    public static void main(String[] args) {
//           *
//          ***
//         *****
//        *******
//         *****
//          ***
//           *

        int n = 4;
        for(int row = 1; row <= n; row++){
            //print first pyramid
            for(int space = 1; space <= n - row; space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= 2 * row - 1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        //print second pyramid nd skip 7 stars line so start from n - 1
        for(int row = n - 1; row >= 1; row--){
            //print first pyramid
            for(int space = 1; space <= n - row; space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= 2 * row - 1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
