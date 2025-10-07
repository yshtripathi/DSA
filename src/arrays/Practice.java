package arrays;

import static java.lang.Integer.MIN_VALUE;

public class Practice {
    public static void main(String[] args) {
        int arr[] = {1,1,1,3,4,1,2};
       int res = solve(arr);
        System.out.println(res);
    }
    static int solve(int[] arr){
        int candidate = -1;
       int count = 0;
       for(int i = 0; i < arr.length; i++){
           if(count == 0){
               candidate = arr[i];
               count = 1;
           } else if(arr[i] == candidate) {

                   count++;
           }
           else{
               count--;
           }
       }
       count = 0;
       for(int i = 0; i < arr.length; i++){
         if(candidate == arr[i]){
             count++;
         }
         if(count > (arr.length)/2){
             return candidate;
         }
       }
       return -1;
    }
}