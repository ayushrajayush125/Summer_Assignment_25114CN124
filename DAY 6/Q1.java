import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Write a program to Convert decimal to binary.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        String binary = "";

        if (n == 0) {
            binary = "0";
        }

        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }

        System.out.println("ans: " + binary);

        sc.close();
    }
}