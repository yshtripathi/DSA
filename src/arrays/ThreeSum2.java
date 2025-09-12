package arrays;

import java.util.Arrays;

public class ThreeSum2 {
    static void solve(int a[], int target){
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++){
            if(i > 0 && a[i] == a[i-1]){
                continue;
            }
            int j = i+1;
            int k = a.length-1;
            while(j < k){
                int sum = a[i] + a[j] + a[k];
                if(sum < target){
                    j++;
                }
                else if(sum > target){
                    k--;
                }
                else{
                    System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    while(j < k && a[j] == a[j+1] ){
                        j++;
                    }
                    while(j < k && a[k] == a[k-1] ){
                        k--;
                    }
                }
                j++;
                k--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 14;
        System.out.println("3 sum of the following array: ");
        solve(arr, target);
        System.out.println();
    }
}
