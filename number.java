import java.util.*;
//negative , positive , zero
public class number {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        if (n > 0) {
            System.out.println("The number is positive");
        }
        else if (n < 0) {
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is zero");
        }
        System.out.println();

    }
}
