package arrays;

public class LongSubArraySumK {
    public static void main(String[] args) {
        int[] arr ={-1,1,1};
        int k = 1;
        System.out.println("Longest subarray with sum k:" +solve(arr, k));
    }
    static int solve(int[] a, int k){
        int n = a.length;
        int l = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int s = 0;
                for(int m = i; m <= j; m++){
                    s+=a[m];
                }
                if(s == k){
                    int curLength = j-i+1;
                    if(curLength > l){
                        l = curLength;
                    }
                }
            }
        }
        return l;
    }
}
