import java.util.*;
class prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        if(n==0||n==1)
        {
            System.out.println("not a prime number");
        }
        else
        {
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    System.out.println("not a prime");
                    f=1;
                    break;
                }
            }
            if(f==0)
                System.out.println("prime");
        }
    }
}