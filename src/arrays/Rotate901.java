package arrays;

public class Rotate901 {
    static int[][] solve(int[][] matrix){
        int arr[][] = new int[4][4];
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] res = solve(arr);
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res.length; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }
}
