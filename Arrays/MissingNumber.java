import java.util.Scanner;

public class MissingNumber{
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int res[] = new int[n-1];

        for(int i =0; i<n-1;i++)
        {
            res[i] = scanner.nextInt();
        }

        long N = n;

        long x = (N*(N+1l))/2l;

        long y = 0;
        for(int i =0; i<n-1;i++)
        {
            y = y + res[i];
        }

        long sum = x-y;
        System.out.println(sum);
    }
}