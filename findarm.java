//find armstrong number  between 1 to n 

import java.util.Scanner;

public class findarm {
    public static boolean isArmstrong(int n) {
        int copyofN = n;
        int numberOfDigits = 0;

        while (n > 0) {
            numberOfDigits++;
            n = n / 10;
        }
        int sum = 0;
        n = copyofN;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit, numberOfDigits);
            n = n / 10;
        }
        if (sum == copyofN) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i) == true) {
                System.out.println(i + " ");
            }
        }

        
    }   
}