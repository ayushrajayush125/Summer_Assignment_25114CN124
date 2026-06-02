package day2;
import java.util.Scanner;
public class Q4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("\nQ8) Write a program to check whether a number is palindrome.");
        System.out.print("Enter N: ");
        n=sc.nextInt();
        if(n<0||(n%10==0&&n!=0))
            System.out.println("NO");
        else{
            int rev=0;
            while(n>rev){
                int digit=n%10;
                rev=rev*10+digit;
                n/=10;
            }
            if(rev==n||n==rev/10)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
