package arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] a = {1,2,3,45,67,8};
        solve(a);
            System.out.print(Arrays.toString(a));
    }
    static void solve(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

    }
}
