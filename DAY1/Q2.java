import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Q2) Write a program to print multiplication table of a given number.");
        System.out.print("Enter N: ");
        n = sc.nextInt();

        int i = 1;

        while (i <= 10) {
            int ans = n * i;
            System.out.println(n + " x " + i + " = " + ans);
            i++;
        }

        sc.close();
    }
}
