import java.util.*;

public class Q3{
    public static void main(String[]args){
        System.out.println("Write a program to Print factors of a number.");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=sc.nextInt();

        if(n<0){
            System.out.print("invalid input");
        }else if(n==1){
            System.out.print(1);
        }else if(n==0){
            System.out.print("every non-zero number is a factor.");
        }else{
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    System.out.println(i);
                }
            }
        }
    }
}
