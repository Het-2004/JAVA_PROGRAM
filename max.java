import java.util.*;

public class max {
    public static void main(String[] args) {
        System.out.print("Enter three Numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println();

        if (a > b && a > c) {
            System.out.println(a + " is the largest");
        }
        else if (b > a && b > c) {
            System.out.println(b + " is the largest");
        }
        else {
            System.out.println(c + " is the largest");
        }
    }
}
