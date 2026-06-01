import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {

        int n = 0;

        System.out.println("Q3) Write a program to find factorial of a number.");
        System.out.print("Enter N: ");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int ans = 1;

        while (n > 0) {
            ans = ans * n;
            n--;
        }

        System.out.println("Factorial: " + ans);

        sc.close();
    }
}
