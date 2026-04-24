package Recursion;

public class _9_ReverseNum {
    static int ans = 0;
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
    public static int reverse(int n) {

        if (n == 0) {
            return ans;
        }
        int rem = n % 10;
        ans = ans * 10 + rem;
        return reverse(n / 10);
    }
}
