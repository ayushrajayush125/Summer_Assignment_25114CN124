import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Write a program to write nth Fibonacci term.");

        int prev = 0;
        int next = 1;
        int n = 0;
        int ans = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                ans = i;
            } else {
                int curr = prev + next;
                ans = curr;
                prev = next;
                next = curr;
            }
        }

        System.out.println(ans + " is the ans");
    }
}