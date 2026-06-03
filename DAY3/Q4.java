import java.util.Scanner;
public class Q4{
    static int getGCD(int divisor,int dividend){
        if(dividend<divisor){
            int temp=dividend;
            dividend=divisor;
            divisor=temp;
        }
        while(divisor!=0){
            int remainder=dividend%divisor;
            dividend=divisor;
            divisor=remainder;
        }
        return dividend;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Write a program to Find LCM of two numbers.");
        System.out.print("Enter first number: ");
        int first=sc.nextInt();
        System.out.print("Enter second number: ");
        int second=sc.nextInt();
        int ans=(first*second)/getGCD(first,second);
        System.out.println(ans);
        sc.close();
    }
}
