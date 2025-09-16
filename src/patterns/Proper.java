package patterns;

public class Proper {
    static void solve(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void solveInverted(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*(n-i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
       solve(n);
        solveInverted(n);
    }
}
