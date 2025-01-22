import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n = sc.nextInt();
        float f = sc.nextFloat();

        System.out.println(ch);
        System.out.println(n);
        System.out.println(f);
    }
    
}
