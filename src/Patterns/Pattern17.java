package Patterns;

public class Pattern17 {
    public static void main(String[] args) {
//        *******
//         *****
//          ***
//           *

        int n = 4;
        for(int row = 4; row >= 1; row--){
            //print spaces
            for(int space = 1; space <= n - row; space++){
                System.out.print(" ");
            }
            //print stars
            for(int star = 1; star <= 2 * row - 1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
