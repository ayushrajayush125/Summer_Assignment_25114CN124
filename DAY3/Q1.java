import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        System.out.println("Write a program to check whether a number is prime.");
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.print("Enter N: ");
        n=sc.nextInt();
        int flg=0;
        if(n<2)
            System.out.println("not prime");
        else if(n==2)
            System.out.println("prime");
        else{
            for(int i=2;i<n;i++){
                if(n%i==0)
                    flg=1;
            }
            if(flg==0)
                System.out.println("prime");
            else
                System.out.println("not prime");
        }
        sc.close();
    }
}