package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
//        *
//        * *
//        * * *
//        * * * *

        int n = 4;
        for(int row = 1; row <= n; row++){    //row runs 1 to 4
            for(int col = 1; col <= row; col++){    //prints stars equal to current row
                System.out.print("* ");
            }
            System.out.println();  //space after each row
        }
    }
}
