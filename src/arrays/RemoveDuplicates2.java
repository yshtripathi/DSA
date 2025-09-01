//Better Approach
package arrays;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,3,4};
        int k = removeDuplicates2(arr);
        System.out.println("After Removal of duplicate Elements : ");
        for(int i = 0; i < k; i++){
            System.out.print(arr[i] + " ");
        }

    }
    static int removeDuplicates2(int a[]){
        int i = 0;
        for(int j = 1; j < a.length; j++){
            if(a[j] != a[i]){
                a[i+1] = a[j];
                i++;
            }
        }
        return i + 1;
    }
}
