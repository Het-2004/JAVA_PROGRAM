//Convert number from Binary to Decimal

import java.util.Scanner;

public class BitoDe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int power = 1;
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit * power;
            power *= 2;
            n = n / 10;
        }
        System.out.println(sum);
    }    
}
