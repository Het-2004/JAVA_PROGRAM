import java.util.Scanner;

public class interest {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Principal amount : ");
        float p = sc.nextFloat();
        System.out.println();
        System.out.print("Enter Rate of Interest : ");
        float r = sc.nextFloat();
        System.out.println();
        System.out.print("Enter Time : ");
        float t = sc.nextFloat();
        System.out.println();

        float interest = (p * r * t) / 100;
        System.out.println(interest);
    }
}
