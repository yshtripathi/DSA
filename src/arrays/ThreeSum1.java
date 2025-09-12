package arrays;

import java.util.HashSet;
import java.util.Set;

public class ThreeSum1 {
    static void solve(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                for(int k = j+1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        System.out.println(arr[i] + " " + arr[j] + " " +arr[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 14;
        System.out.println("3 sum of the following array: ");
        solve(arr, target);
    }
}
