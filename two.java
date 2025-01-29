import java.util.*;

public class two {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of printing hello : ");
        int n = sc.nextInt();

        while (n <= 10) {
            System.out.println("Hello");
            n = n + 1;
        }
    }
}
