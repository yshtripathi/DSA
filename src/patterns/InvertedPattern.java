package patterns;

public class InvertedPattern {
    static void solveStars(int n ){
        for(int i = 1 ; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void solveJ(int n){
        for(int i = 1; i <= n ; i++){
            for(int j = n; j >= i; j--){
                System.out.print(n-j+1 + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        //solveStars(n);
        solveJ(n);
    }
}
