import java.util.*;

public class calculator {
    public static double sum (int a, int b) {
        return a + b;
    }
    public static double sub (int a, int b) {
        return a - b;
    }
    public static double mul (int a, int b) {
        return a * b;
    }
    public static double div (int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The sum of the two numbers is: " + sum(a, b));
        System.out.println("The difference of the two numbers is: " + sub(a, b));
        System.out.println("The product of the two numbers is: " + mul(a, b));
        System.out.println("The division of the two numbers is: " + div(a, b));
    }
    
}
