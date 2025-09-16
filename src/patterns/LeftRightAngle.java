package patterns;

public class LeftRightAngle {
    static void solveStar(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void solveJ(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void solveI(int n){
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        //solveStar(n);
        //solveJ(n);
        solveI(n);
    }
}
