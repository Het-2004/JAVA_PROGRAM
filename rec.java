import java.util.*;
//area and perimeter of rectangle
public class rec {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side: ");
        float a = sc.nextFloat();
        
        System.out.print("Enter second side: ");
        float b = sc.nextFloat();
        System.out.println();

        float area = a * b;
        float perimeter = 2 * (a + b);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println();
    }
}
