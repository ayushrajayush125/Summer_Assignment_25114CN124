import java.util.*;

public class Q1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Write a program to check perfect number.");
int n=sc.nextInt();
int sum=0;
if(n<=1){
System.out.print("invalid input");
return;
}
for(int i=1;i<n;i++){
if(n%i==0)sum+=i;
}
if(sum==n)System.out.print("true");
else System.out.print("false");
}
}