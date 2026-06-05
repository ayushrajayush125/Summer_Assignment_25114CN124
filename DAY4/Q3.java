import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Write a program to check Armstrong number.");
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        n = sc.nextInt();
        int x = n;
        int digi = 0;
        int sum = 0;
        while (x > 0) {
            digi++;
            x /= 10;
        }
        x = n;
        while (x > 0) {
            int lastDigit = x % 10;
            sum += (int)Math.pow(lastDigit, digi);
            x /= 10;
        }
        if (sum == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}