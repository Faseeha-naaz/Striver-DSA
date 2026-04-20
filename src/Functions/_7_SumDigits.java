package Functions;

public class _7_SumDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(12345));
    }
    public static int addDigits(int num){
        int sum = 0;
        while (num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }
}
