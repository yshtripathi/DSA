package digits;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n;
        int count = 0;
        int arms = 0;
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        int temp = n;
        while( temp > 0){
            count++;
            temp = temp/10;
        }
        temp = n;
        while (temp > 0){
            int lastdigit = temp%10;
            int pow  = 1;
            for(int i = 0; i < count; i++){
                pow = pow * lastdigit;
            }
            arms = arms + pow;
            temp = temp/10;
        }
        if(arms == n){
            System.out.println("Number is armstrong");
        }
        else System.out.println("Number is not armstrong");
    }
}
