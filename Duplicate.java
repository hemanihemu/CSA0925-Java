import java.util.*;

public class Duplicate {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n,i,j,k;
        n=input.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    for(k=j;k<n-1;k++)
                    {
                        a[k]=a[k+1];
                    }
                    j--;
                    n--;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(+a[i]);
        }
    }
}