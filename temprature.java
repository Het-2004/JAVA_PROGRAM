import java.util.*;

//Convert temperature from Fahrenheit to Celsius
public class temprature {
    public static void main(String[] args) {
        System.out.println();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter temperature in Fahrenheit: ");
        float f = sc.nextFloat();
        System.out.println();
        float c = (f - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + c);
        System.out.println();
    }
}
