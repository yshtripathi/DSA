package digits;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits");
        n = sc.nextInt();
        int count  = 0;
        while(n > 0){
            int last = n%10;
            n = n/10;
            count++;
        }
        System.out.println("Total number of digits: " +count);

    }
}
