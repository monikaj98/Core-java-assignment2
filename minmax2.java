import java.util.*;
class minmax2
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
        int max=a[0];
        int min=a[0];
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
                max=a[i];
             if(min>a[i])
                min=a[i];
        }
        System.out.println("max= "+max);
        System.out.println("min= "+min);
        int secmax=a[0];
        int secmin=a[0];
        for(int i=0;i<n;i++)
        {
            if(secmax<a[i]&&max>a[i])
                secmax=a[i];
            if(secmin>a[i]&&min<a[i])
                secmin=a[i];
        }
        System.out.println("secmax= "+secmax);
        System.out.println("secmin= "+secmin);
    }
}