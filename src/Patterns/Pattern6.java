package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
//        1 2 3 4
//        1 2 3
//        1 2
//        1

        int n = 4;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n - row + 1; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
