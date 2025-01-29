//Program to find the prime factors of a number

import java.util.Scanner;

public class primefactor {
    public static boolean isPrime(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }

    }
}
