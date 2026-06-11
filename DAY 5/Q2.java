import java.util.*;
public class Main{
    static int getFac(int i){
        if(i==0){
            return 1;
        }
        return i*getFac(i-1);
    }
    public static void main(String[]args){
        System.out.println("Write a program to check strong number.");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=sc.nextInt();
        int sum=0;
        int x=n;

        while(x>0){
            sum+=getFac(x%10);
            x/=10;
        }
        if(sum==n){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}
