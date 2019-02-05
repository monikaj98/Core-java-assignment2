import java.util.*;
class mostoccur
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
        int c=0,m=0,im=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c>m)
            {
                m=c;
                im=i;
            }
        }
       
           System.out.print(a[im]);
        
    }
}