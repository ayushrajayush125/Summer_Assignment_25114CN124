import java.util.*;

public class Q4{
    static boolean checkPrime(int k){
        for(int i=2;i<k;i++){
            if(k%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        System.out.println("Write a program to Print factors of a number.");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=sc.nextInt();
        int ans=0;

        if(n<0||n==1){
            System.out.print("invalid input");
        }else if(n==0){
            System.out.print("infinity");
        }else{
            for(int i=2;i<=n;i++){
                if(n%i==0&&checkPrime(i)){
                    ans=Math.max(i,ans);
                }
            }
            System.out.print("max prime is "+ans);
        }
    }
}