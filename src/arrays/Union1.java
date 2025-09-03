//Union with distinct and duplicate elements (both sorted and unsorted array)
package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Union1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {1,2,4,5,5,5,55,7};
        int res[] = solve(arr1, arr2);
        System.out.println("array after union: ");
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }

    }
    static int[] solve(int arr1[], int arr2[]){
        Set<Integer> s1 = new HashSet<>();
        for(int i = 0; i < arr1.length; i++){
            s1.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            s1.add(arr2[i]);
        }
        int res[] = new int[s1.size()];
        int x = 0;
        for(int i : s1){
            res[x++] = i;
        }
        return res;
    }
}
