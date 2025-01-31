import java.util.Scanner;

public class findP {
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n and r: ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        long n_fact = factorial(n);
        long n_r_fact = factorial(n - r);
        long nPr = n_fact / n_r_fact;
        System.out.println(nPr);
        sc.close();

    }
}


// Output:
// Enter the value of n and r: 5 2
// 20