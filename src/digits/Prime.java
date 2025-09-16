package digits;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Number is prime");
        }
        else System.out.println("Number is not prime");
    }
}
