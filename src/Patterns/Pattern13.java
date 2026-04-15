package Patterns;

public class Pattern13 {
    public static void main(String[] args) {
//            1 2 3 4
//            2 3 4
//            3 4
//            4
        int n = 4;
        for(int row = 1; row <= n; row++){
            int res = row;
            for(int col = 1; col <= n - row + 1; col++){
                System.out.print(res+" ");
                res++;
            }
            System.out.println();
        }

    }
}
