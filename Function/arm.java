import java.util.Scanner;

public class arm {
    public static boolean isArmstrong(int n){
        int copy = n;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }
        if (sum == copy){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if (isArmstrong(a)){
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}
