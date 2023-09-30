/*Product of two number*/ 
import java.util.*;

public class Product{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number x : ");
        float x = sc.nextFloat();
        System.out.print("Enter number y : ");
        float y = sc.nextFloat();
        float Product = x * y;
        System.out.println(Product);
    }
}