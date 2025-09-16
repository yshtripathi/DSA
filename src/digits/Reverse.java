package digits;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int revNum = 0;
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        while(n > 0){
            int lastdigit = n % 10;
            n = n/10;
            revNum = (revNum*10) + lastdigit;
        }
        System.out.println("After reversing the number: " +revNum);
    }
}
