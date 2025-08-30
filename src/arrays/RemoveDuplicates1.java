package arrays;

import java.util.HashSet;

public class RemoveDuplicates1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1,2,8,9,1};
        int result = removeDuplicates1(arr);
        System.out.println("After removing the duplicate elements: ");
        for(int i = 0; i < result; i++){ //to print only unique elements
            System.out.print(arr[i] + " ");
        }

    }
    static int removeDuplicates1(int[] a){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            set.add(a[i]);
        }
        int k = set.size(); //k: store count //size: size of hash set
        int j = 0; //intialize arr with 0th index
        for(int x : set){ //copy element from set to x
            a[j++] = x;
        }
        return k;
    }
}
