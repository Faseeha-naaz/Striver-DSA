package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
//        A
//        A B
//        A B C
//        A B C D

        int n = 4;
        for(int row = 1; row <= n; row++){
            char alphabet = 'A';
            for(int col = 1; col <= row; col++){
                System.out.print(alphabet+" ");
                alphabet++;
            }
            System.out.println();
        }
    }
}
