import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Write a program to Count set bits in a number.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }

        System.out.println("ans: " + count);

        sc.close();
    }
}