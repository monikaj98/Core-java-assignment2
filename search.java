import java.util.*;
class search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=sc.nextInt();
        int f=0;
        int an=0;
        for(int i=0;i<n;i++)
        {
            if(s==a[i])
            {
                f=1;
                an=i+1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println(an);
        }
        else
            System.out.println("-1");
    }
}