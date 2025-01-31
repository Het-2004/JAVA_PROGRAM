import java.util.Scanner;

public class MaxMin {
    
    public static void main(String[] args) {
        int num1, num2, maximum, minimum;
        
        /* Input two numbers from user */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        maximum = max(num1, num2);  // Call maximum function
        minimum = min(num1, num2);  // Call minimum function
        
        System.out.println("\nMaximum = " + maximum);
        System.out.println("Minimum = " + minimum);
        
        sc.close();
    }

    /**
     * Find maximum between two numbers.
     */
    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    /**
     * Find minimum between two numbers.
     */
    public static int min(int num1, int num2) {
        return (num1 > num2) ? num2 : num1;
    }
}

