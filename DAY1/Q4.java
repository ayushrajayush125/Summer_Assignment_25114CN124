import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int n = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Q4) Write a program to count digits in a number.");
        System.out.print("Enter N: ");
        n = sc.nextInt();

        int digi = 0;

        if (n < 0) {
            n = -n;
        }

        while (n > 0) {
            digi++;
            n /= 10;
        }

        System.out.println("Digits: " + digi);

        sc.close();
    }
}
