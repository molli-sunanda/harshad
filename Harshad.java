import java.util.Scanner;
public class Harshad
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("give a number");
int num=sc.nextInt();
int n=num,x,sum=0;
while(n>0)
{
x=n%10;
sum=sum+x;
n=n/10;
}
if(num%sum==0)
System.out.println("This number is a harshad number"+num);
else
System.out.println("This number is not a harshad number"+num);
}
}