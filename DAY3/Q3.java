import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a program to Find GCD of two numbers.");
        int divisor = 0;
        int dividend = 0;
        System.out.print("Enter first number: ");
        divisor = sc.nextInt();
        System.out.print("Enter second number: ");
        dividend = sc.nextInt();
        if (dividend < divisor) {
            int temp = dividend;
            dividend = divisor;
            divisor = temp;
        }
        while (divisor != 0) {
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        System.out.println(dividend);
        sc.close();
    }
}
