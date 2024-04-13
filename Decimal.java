import java.util.*;
class Decimal
{
  public static void main(String args[])
   {
     int i=1,bin=0,rem,no;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter num");
     no=sc.nextInt();
     while(no!=0)
     {
      rem=no%2;
      bin=i*rem;
      no=no/2;
      i=i*10;
      }
      System.out.println("Binary num:"+ bin);
    }
}