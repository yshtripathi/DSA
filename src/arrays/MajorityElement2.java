package arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MajorityElement2 {
    static int solve(int arr[]){
        int count = 0;
        int candidate = -1;
        for(int i = 0; i < arr.length; i++){
            if(count == 0){
                candidate =arr[i];
                count = 1;
            }
            else {
                if (arr[i] == candidate) {
                    count++;
                }
                else count--;
            }
        }
        count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == candidate){
                count++;
            }
            if(count > (arr.length)/2){
                return candidate;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in the array: ");
        for(int i = 0; i < n; i++){
          arr[i] = sc.nextInt();
        }
        System.out.println("Majority Element in the array: " +solve(arr));
    }
}
