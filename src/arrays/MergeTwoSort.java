package arrays;

import java.util.Arrays;

public class MergeTwoSort {
    static void solve(int[] a1, int[] a2){
        int n = a1.length;
        int m = a2.length;
        int i = n-1;
        int j = 0;
        while(i >= 0 && j < m){
            if(a1[i] > a2[j]){
                int temp = a1[i];
                a1[i] = a2[j];
                a2[j] = temp;
            }
            i--;
            j++;
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println("Arrays after sorting: ");
        for(int k = 0; k < n ; k++){
            System.out.print(a1[k] + " ");
        }
        System.out.println();
        for(int l = 0 ; l < m; l++){
            System.out.print(a2[l] + " ");
        }
    }
    public static void main(String[] args) {
        int[] a1 ={1,3,5,7,9};
        int[] a2 ={2,4,6,8};
        solve(a1, a2);
    }
}
