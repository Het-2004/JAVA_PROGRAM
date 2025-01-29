import java.util.*;

public class hellofor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of times you want to print Hello : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }
        System.out.println();
    }
}
