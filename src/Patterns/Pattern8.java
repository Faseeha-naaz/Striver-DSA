package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
//        A B C D
//        E F G
//        H I
//        J

        int n = 4;
        char alphabet = 'A';
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n - row + 1; col++){
                System.out.print(alphabet+" ");
                alphabet++;
            }
            System.out.println();
        }
    }
}
