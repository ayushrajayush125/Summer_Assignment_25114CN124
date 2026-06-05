import java.util.*;

public class Q4 {
    static int getArmstrong(int n) {
        int x = n;
        int digi = 0;
        int sum = 0;
        while (x > 0) {
            digi++;
            x /= 10;
        }
        x = n;
        while (x > 0) {
            int lastDigit = x % 10;
            sum += (int)Math.pow(lastDigit, digi);
            x /= 10;
        }
        if (sum == n) {
            return n;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Write a program to Armstrong number in a range.");
        int l = 0;
        int u = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower bound: ");
        l = sc.nextInt();
        System.out.print("Enter upper bound: ");
        u = sc.nextInt();
        for (int i = l; i <= u; i++) {
            if (getArmstrong(i) != -1) {
                System.out.println(getArmstrong(i));
            }
        }
    }
}