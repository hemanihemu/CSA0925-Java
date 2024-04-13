class AThread implements Runnable
 {
    public void run() 
{
        
        int n, flag = 0;
         n=5;
        for (int i = 2; i <= n/2; i++)
 {
            if (n % i == 0) 
{
                System.out.println(n + " is not a prime");
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println(n + " is a prime number");
        
    }
}


 class prime
{
    public static void main(String[] args)
 {
        AThread a = new AThread();
       

        Thread t1 = new Thread(a);
       
        t1.start();
    }
}
