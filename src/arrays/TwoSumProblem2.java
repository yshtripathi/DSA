package arrays;

import java.util.Arrays;

public class TwoSumProblem2 {
    static boolean solve(int arr[], int target){
        int i = 0;
        int j = arr.length-1;
        Arrays.sort(arr);
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                System.out.println(" Pair Found " +arr[i]+ " and " +arr[j]);
                return true;
            } else if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 15;
        System.out.println(solve(arr, target));
    }
}
