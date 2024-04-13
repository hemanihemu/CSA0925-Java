import java.util.*;
class Fact
{
public static void main(String args[])
{
int i,fact=1,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("Factorial of number is:"+fact);
}
}
