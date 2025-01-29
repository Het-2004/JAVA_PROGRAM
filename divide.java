import java.util.*;
//divided by 5 and 11 or not 
public class divide {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        if (n % 5 == 0 && n % 11 == 0) {
            System.out.println("The number is divided by 5 and 11");
        }
        else {
            System.out.println("The number is not divided by 5 and 11");
        }
    }
}
