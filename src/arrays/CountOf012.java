package arrays;

public class CountOf012 {
    static int[] solve(int arr[]){
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count_0++;
            } else if (arr[i] == 1) {
                count_1++;
            }
            else if (arr[i] == 2) {
                count_2++;
            }
        }
        int index = 0;
        for(int i = 0; i < count_0; i++){
            arr[index++] = 0;
        }
        for(int i = 0; i < count_1; i++){
            arr[index++] = 1;
        }
        for(int i = 0; i < count_2; i++){
            arr[index++] = 2;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,2,1,1,1,1,1,2,0,0,0,0,0};
        int[] s = solve(arr);
        System.out.println("After sorting array is: " );
        for(int i = 0; i < s.length; i++){
            System.out.print(s[i] + " ");
        }
    }
}
