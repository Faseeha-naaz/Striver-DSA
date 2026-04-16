package Basics;

public class _35_AddFractionLCM {
    public static void main(String[] args) {
        //1/6 + 1/4 = 5 / 12
        //step 1: Find LCM of Denominators
        //step 2: Convert Fractions
        //step 3: Add Numerators
        //step 4: get the result

        int n1 = 1, n2 = 1;
        int d1 = 6, d2 = 4;

        int x = d1, y = d2;
        //lcm of denominators
        while(y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        int lcm = (d1 * d2) / x;
        System.out.println("LCM: "+lcm);

        //convert into fractions
        int new_n1 = n1 * (lcm / d1);
        System.out.println("New first numerator: "+new_n1);
        int new_n2 = n2 * (lcm / d2);
        System.out.println("New second numerator: "+new_n2);

        //add numerators
        int added_n = new_n1 + new_n2;
        System.out.println("Added numerators: "+added_n);

        //final result
        System.out.println("Added fraction is: "+added_n + "/" + lcm);

    }
}
