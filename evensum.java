import java.util.*;
//sum of all even number between 1 to n 
public class evensum {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of all even numbers between 1 to " + n + " is " + sum);

    }
}
