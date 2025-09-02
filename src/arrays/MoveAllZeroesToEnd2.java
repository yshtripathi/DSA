package arrays;

public class MoveAllZeroesToEnd2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,0,2,300,0,90,9,0};
        int[] sol = solve(arr);
        System.out.println("After moving 0s to the end : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(sol[i] + " ");
        }
    }
    static int[] solve(int arr[]){
        int j = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if (j == -1) return arr;
        for(int i = j+1; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return  arr;
    }
}
