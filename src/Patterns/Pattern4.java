package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
//        A
//        B C
//        D E F
//        G H I J

//        Reset inside loop → repeats pattern
//        Declare outside loop → continuous pattern

        int n = 4;
        char alphabet = 'A';   //does not reset every row  -> continuous pattern
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(alphabet+" ");
                alphabet++;
            }
            System.out.println();
        }
    }
}
