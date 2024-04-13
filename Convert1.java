import java.util.*;
class Convert1
{
public static void main(String args[])
{
int n1,i,rem,dec=0,n,j,rem1,oct=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
n1=n;
while(n1!=0)
{
rem=n1%10;
dec=dec+10*rem;
n1=n1/10;
i=i*2;
}
System.out.println("binary to decimal number is:"+dec);
while(n!=0)
{
rem1=n%8;
oct=oct+10*rem1;
n=n/8;
j=j*2;
}
System.out.println("binary to octal number is:"+oct);
}
}