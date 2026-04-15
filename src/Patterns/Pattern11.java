package Patterns;

public class Pattern11 {
    public static void main(String[] args) {
//        1
//        2 2
//        3 3 3
//        4 4 4 4

        int n = 4;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
