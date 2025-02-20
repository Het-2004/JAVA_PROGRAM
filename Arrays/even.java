import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.print("Even numbers are : ");
        if (countEven > 0) {
            int even[] = new int[countEven];
            int indexEven = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
        System.out.print("Odd numbers are : ");
        if (countOdd > 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
