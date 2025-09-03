//Intersection with distinct elements (both sorted and unsorted array)
package arrays;

import java.util.ArrayList;

public class Intersection1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,5,7};
        int[] intersect = solve(arr1, arr2);
        for(int i = 0; i < intersect.length; i++){
            System.out.print(intersect[i] + " ");
        }
    }
    static int[] solve(int a1[], int a2[]){
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i < a1.length; i++){
            for(int j = 0; j < a2.length; j++){
                if(a1[i] == a2[j] ){
                    if(!l.contains(a1[i])){
                        l.add(a1[i]);
                        break;
                    }
                }
            }
        }
        int res[] = new int[l.size()];
        int k = 0;
        for(int x : l){
            res[k++] = x;
        }
        return res;
    }
}
