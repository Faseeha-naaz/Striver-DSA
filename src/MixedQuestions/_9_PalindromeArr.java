package MixedQuestions;

public class _9_PalindromeArr {
    public static void main(String[] args) {
        //check if array is palindrome
        int[] arr = {1,2,3,2,1};

        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] != arr[j]){
                System.out.println("Not a palindrome");
                return;   //return early
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
