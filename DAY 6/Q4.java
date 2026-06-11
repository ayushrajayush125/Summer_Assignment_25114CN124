import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Write a program to Find x^n without pow().");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.print("Enter X: ");
        int x = sc.nextInt();

        long ans = 1;

        for (int i = 1; i <= n; i++) {
            ans *= x;
        }

        System.out.println("ans: " + ans);

        sc.close();
    }
}