import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        int n = 0;

        System.out.println("Q1) Write a program to calculate sum of first N natural numbers.");
        System.out.print("Enter N: ");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("ANS: " + sum);

        sc.close();
    }
}
