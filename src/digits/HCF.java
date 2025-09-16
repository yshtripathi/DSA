package digits;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        int n;
        int m;
        int gcd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        n = sc.nextInt();
        System.out.println("Enter second number: ");
        m = sc.nextInt();
        System.out.print("HCF of the numbers is: ");
        for(int i = 1; i <= Math.min(n,m); i++){
            if(n%i ==0 && m%i == 0){
              gcd = i;
            }
        }
        System.out.println(gcd);
        int lcm = (n*m)/gcd;
        System.out.println("LCM of the number is: " +lcm);
    }
}
