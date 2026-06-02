package day2;
import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("\nQ7) Write a program to find product of digits.");
        System.out.print("Enter N: ");
        n=sc.nextInt();
        int ans=1;
        if(n<0)
            n=-n;
        while(n>0){
            int digit=n%10;
            ans=ans*digit;
            n/=10;
        }
        System.out.println("ANS: "+ans);
        sc.close();
    }
}
