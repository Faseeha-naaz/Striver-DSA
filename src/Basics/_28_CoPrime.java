package Basics;

public class _28_CoPrime {
    public static void main(String[] args) {
        //Two numbers are co prime if gcd = 1
        int a = 8;
        int b = 15;

        while(b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        if(a == 1){
            System.out.println("Co-Prime");
        } else{
            System.out.println("Not Co-Prime");
        }
    }
}
