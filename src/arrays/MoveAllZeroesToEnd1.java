//Brute-Force Approach
package arrays;

import java.util.ArrayList;

public class MoveAllZeroesToEnd1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,0,2,300,0,90,9,0};
        int[] sol = solve(arr);
        System.out.println("After moving 0s to the end : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(sol[i] + " ");
        }
    }
    static int[] solve(int[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }
        for(int i = 0; i < temp.size(); i++){
            arr[i] = temp.get(i);
        }
        int nz = temp.size();
        for(int i = nz; i < arr.length; i++){
            arr[i] = 0;
        }
        return arr;
    }
}
