import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Write a program to Convert binary to decimal.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int decimal = 0;
        int power = 1;

        while (n > 0) {
            int lastDigit = n % 10;
            decimal += lastDigit * power;

            power *= 2;
            n /= 10;
        }

        System.out.println("ans: " + decimal);

        sc.close();
    }
}