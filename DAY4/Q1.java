import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Write a program to generate Fibonacci series.");

        int prev = 0;
        int next = 1;
        int n = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                System.out.println(i);
            } else {
                int curr = prev + next;
                System.out.println(curr);
                prev = next;
                next = curr;
            }
        }
    }
}