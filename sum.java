/*sum of two numbers*/
import java.util.*;

public class sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number x : ");
        float x = sc.nextFloat();
        System.out.print("Enter number y : ");
        float y = sc.nextFloat();
        float sum = x + y;
        System.out.println(sum);  
    }
}