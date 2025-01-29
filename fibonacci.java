//Print the fibonacci series upto n terms

import java.util.*;

public class fibonacci {
    public static boolean fibo(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        fibo(n);
    }
}
