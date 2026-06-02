import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int n = 0;

        System.out.println("Q5) Write a program to calculate sum of digits of a number.");
        System.out.print("Enter N: ");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int sum = 0;

        while (n > 0) {
            int digi = n % 10;
            sum += digi;
            n /= 10;
        }

        System.out.println("ANS: " + sum);

        sc.close();
    }
}
