package digits;

public class Factorial {
    static int solve(int n){
        if(n==0){
            return 1;
        }
        return n *solve(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solve(n));

    }
}
