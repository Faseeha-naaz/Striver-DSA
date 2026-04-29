package Recursion;

public class _30_Binarystr {
    public static void main(String[] args) {
        //Print all binary strings of length 2
        //Each position can be: 0 or 1
        binary(2, "");
    }
    public static void binary(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        binary(n - 1, ans + "0");
        binary(n - 1, ans + "1");
    }
}
//binary(2,"")
//   /      \
// "0"      "1"
// / \      / \
//00 01    10 11