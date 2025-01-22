import java.util.Scanner;

public class Calculator {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        float sum, minus, multiply, divide, modul;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sum = (a + b);
        minus = (a - b);
        multiply = (a * b);
        divide = (a / b);
        modul = (a % b);

        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(modul);
    }
}
