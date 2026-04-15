package Patterns;

public class Pattern12 {
    public static void main(String[] args) {
//        4 3 2 1
//        3 2 1
//        2 1
//        1

        int n = 4;
        for(int row = 1; row <= n; row++){
            int res = n - row + 1;
            for(int col = 1; col <= n - row + 1; col++){
                System.out.print(res+" ");
                res--;
            }
            System.out.println();
        }
    }
}
