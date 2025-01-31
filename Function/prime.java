import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int lowerlimit, upperlimit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        lowerlimit = sc.nextInt();
        System.out.print("Enter the upper limit: ");
        upperlimit = sc.nextInt();
        sc.close();
        System.out.println();

        System.out.print("Prime numbers between " + lowerlimit + " and " + upperlimit + " are: ");
        for (int i = lowerlimit; i <= upperlimit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

// Output:
// Enter the lower limit: 10
// Enter the upper limit: 50
//
// Prime numbers between 10 and 50 are: 11 13 17 19 23 29 31 37 41 43 47
