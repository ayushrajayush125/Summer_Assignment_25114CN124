import java.util.Scanner;
public class Q2 {
    static boolean isPrime(int n) {
        int flg = 0;
        if (n < 2)
            return false;
        else if (n == 2)
            return true;
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    flg = 1;
            }

            if (flg == 0)
                return true;
            else
                return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a program to print prime numbers in a range.");
        int l = 0, u = 0;
        System.out.print("Enter lower bound: ");
        l = sc.nextInt();
        System.out.print("Enter upper bound: ");
        u = sc.nextInt();
        for (int i = l; i <= u; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
        sc.close();
    }
}
