package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int a = sc.nextInt();
        int[] b = new int[a];
        System.out.println("Enter elements in the array:");
        for(int i = 0; i < b.length;i++){
             b[i] = sc.nextInt();
        }
        int i =0;
        System.out.println("Array without reverse: ");
        for(int x : b){
            System.out.print(x+ " ");
        }
        System.out.println();
        System.out.println("Array after reverse: ");
        solve(b);
            System.out.print(Arrays.toString(b));
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
