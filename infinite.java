import java.util.*;

public class infinite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i>=1; i++){
            int n = sc.nextInt();
            System.out.println(n);

            if (n == 10) {
                break;
            }
        }
        System.out.println("Loop ended");
    }
}
