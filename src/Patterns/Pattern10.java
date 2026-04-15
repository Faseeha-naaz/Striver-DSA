package Patterns;

public class Pattern10 {
    public static void main(String[] args) {
//        1
//        2 3
//        4 5 6
//        7 8 9 10

        int n = 4;
        int res = 1;  //specify here for continuous values
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(res+" ");
                res++;
            }
            System.out.println();
        }
    }
}
