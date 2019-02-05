import java.util.*;
class minmax
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
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
                max=a[i];
        }
        System.out.println("max= "+max);
        int min=a[0];
        for(int i=0;i<n;i++)
        {
            if(min>a[i])
                min=a[i];
        }
        System.out.println("min= "+min);
    }
}