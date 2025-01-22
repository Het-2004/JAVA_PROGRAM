import java.util.*;

public class day {
    public static void main(String[] args) {
        System.out.print("Enter the day number : ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        System.out.println();
        if (day == 1) {
            System.out.println("Monday");
        }
        else if (day == 2) {
            System.out.println("Tuesday");
        }
        else if (day == 3) {
            System.out.println("Wednesday");
        }
        else if (day == 4) {
            System.out.println("Thursday");
        }
        else if (day == 5) {
            System.out.println("Friday");
        }
        else if (day == 6) {
            System.out.println("Saturday");
        }
        else {
            System.out.println("Sunday");
            
        }
        System.out.println();
    }
}
