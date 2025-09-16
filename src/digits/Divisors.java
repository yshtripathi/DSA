package digits;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        System.out.print("Divisors of number are: ");
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print( +i+ " ");
            }
        }
    }
}
