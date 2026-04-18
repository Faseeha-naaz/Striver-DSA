package Basics;

public class _42_NeonNum {
    public static void main(String[] args) {
        //Neon number = [sum of digits of square = original number]
        //9² = 81
        //8 + 1 = 9

        int num = 9;
        int temp = num;
        //find square
        int sq = temp * temp;
        System.out.println("square is: "+sq);

        int add = 0;
        while(sq > 0){
            int rem = sq % 10;
            add = add + rem;
            sq = sq / 10;
        }
        System.out.println("Addition of individual numbers is: "+add);

        if(num == add){
            System.out.println("Neon number");
        }
        else{
            System.out.println("Not a neon number");
        }
    }
}
