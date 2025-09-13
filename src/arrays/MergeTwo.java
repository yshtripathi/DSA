package arrays;

public class MergeTwo {
    static void solve(int[] a1, int a2[]){
        int left = 0;
        int right = 0;
        int index = 0;
        int n = a1.length;
        int m = a2.length;
        int[] a3 = new int[n+m];
        while(left < n && right < m){
            if(a1[left] <= a2[right]){
                a3[index] = a1[left];
                left++;
                index++;
            }
            else{
                a3[index] = a2[right];
                right++;
                index++;
            }
        }
        while(left < n){
            a3[index] = a1[left];
            index++;
            left++;
        }
        while(right < m){
            a3[index] = a2[right];
            index++;
            right++;
        }
        for(int i = 0; i < n+m; i++){
            if(i < n){
                a1[i] = a3[i];
            }
            else{
                a2[i - n] = a3[i];
            }
        }
        System.out.println("Arrays after sorting: ");
        for(int i = 0; i < n ; i++){
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        for(int j = 0 ; j < m; j++){
            System.out.print(a2[j] + " ");
        }
    }
    public static void main(String[] args) {
        int[] a1 ={1,3,5,7,9};
        int[] a2 ={2,4,6,8};
        solve(a1, a2);
    }
}
