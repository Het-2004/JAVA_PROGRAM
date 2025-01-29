import java.util.*;
// enter number is odd or even
public class evenodd {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        if (n % 2 == 0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}
