package MixedQuestions;

public class _13_CountPairs {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4};     //(1,3),(1,3),(1,3),(1,3),(2,2)  ----> ans = 5
        System.out.println(check(arr, 4));
    }
    public static int check(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                //case 1: same elements
                if(arr[left] == arr[right]){
                    int n = right - left + 1;
                    count += (n * (n - 1)) / 2;
                    break;
                }
                //count duplicates on left
                int leftVal = arr[left];
                int leftCount = 0;
                while(left < right && arr[left] == leftVal){
                    leftCount++;
                    left++;
                }

                //count duplicates on right
                int rightVal = arr[right];
                int rightCount = 0;
                while(left <= right && arr[right] == rightVal){
                    rightCount++;
                    right--;
                }
                count += leftCount * rightCount;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
}
