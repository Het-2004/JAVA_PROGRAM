//sum of Digits

import java.util.Scanner;

public class sum {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Sum of digits of " + n + " is: " + sumOfDigits(n));
    }
}

// Output:
// Enter a number: 12345
// Sum of digits of 12345 is: 15
