
public class SubsetSum {

    // static int helper(int [] arr , int i , int tar, int sum){
    //     if(tar==arr.length){
    //         return 0;
    //     }
    //     return -1;
    //     if(helper(arr, i+1, tar, sum)==0){
    //     count++;
    //     }
    //     return count;
    // }
    static int countSubsets(int[] arr, int i, int targetSum) {
        if (targetSum == 0) {
            return 1;
        }
        if (i <= 0) {
            return 0;
        }
        int exclude = countSubsets(arr, i - 1, targetSum);
        int include = 0;
        if (arr[i - 1] <= targetSum) {
            include = countSubsets(arr, i - 1, targetSum - arr[i - 1]);
        }
        return include + exclude;
    }

    public static void main(String[] args) {
        int arr[] = {10,15,20,25};
        int targetSum = 30;
        System.out.println(countSubsets(arr, arr.length, targetSum));

    }
}
