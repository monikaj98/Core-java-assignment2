import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=n;
        int sum=0;
        while(v!=0)
        {
            int r=v%10;
            sum=sum*10+r;
            v=v/10;
        }
        if(sum==n)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome number");
        
    }
}