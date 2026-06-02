package day2;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q2) Write a program to reverse a number.");
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int ans = 0;
        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            n = -n;
        }
        while (n > 0) {
            int digit = n % 10;
            if (ans > Integer.MAX_VALUE / 10 ||
                (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
                System.out.println("invalid");
                sc.close();
                return;
            }
            ans = ans * 10 + digit;
            n /= 10;
        }
        if (isNegative) {
            ans = -ans;
        }
        System.out.println("ANS: " + ans);
        sc.close();
    }
}
