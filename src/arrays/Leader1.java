package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leader1 {
    static int[] solve(int[] arr){
        List<Integer> l = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] > max){
                l.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(l);
        int lead[] = new int[l.size()];
        for(int i = 0; i < l.size(); i++){
            lead[i] = l.get(i);
        }
        return lead;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 7, 2, 4};
        int[] res = solve(arr);
        System.out.println("Leaders in the array: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
