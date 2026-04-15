package Basics;

public class _18_PrintMulTable {
    public static void main(String[] args) {
        //print multiplication table
        int num = 5;
        for(int i = 1; i <= 10; i++){
            int ans = num * i;
            System.out.println(num +" * " +i+ " = " +ans );
        }

    }
}
