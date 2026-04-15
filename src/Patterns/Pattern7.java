package Patterns;

public class Pattern7 {
    public static void main(String[] args) {
//        A B C D
//        A B C
//        A B
//        A

        int n = 4;
        for(int row = 1; row <= n; row++){
            char alphabet = 'A';
            for(int col = 1; col <= n - row + 1; col++){
                System.out.print(alphabet+" ");
                alphabet++;
            }
            System.out.println();
        }
    }
}
