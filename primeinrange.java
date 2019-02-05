import java.util.*;
class primeinrange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int f=0;
        for(int i=10;i<=99;i++)
        {
            f=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                System.out.println(i);
            }
        }
    }
}