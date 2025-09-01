package arrays;

public class LeftRotateBy1p {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        leftRotateBy1p(arr);
    }
     static void  leftRotateBy1p(int a[]){
        int temp = a[0];
        int n = a.length;
        for(int i = 1; i < n; i++){
            a[i-1] = a[i];
        }
        a[n-1] = temp;
         System.out.println("Array after left rotating by one place: ");
        for(int j = 0; j < n; j++){
            System.out.print(a[j] + " ");
        }
    }
}
