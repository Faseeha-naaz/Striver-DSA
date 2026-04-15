package Patterns;

public class Pattern9 {
    public static void main(String[] args) {
//        D C B A
//        C B A
//        B A
//        A

        int n = 4;
        for(int row = 1; row <= n; row++){
            char alphabet = (char) ('A' + n - row);
            for(int col = 1; col <= n - row + 1; col++){
                System.out.print(alphabet+" ");
                alphabet--;
            }
            System.out.println();
        }
    }
}
