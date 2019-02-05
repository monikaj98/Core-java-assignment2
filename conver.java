import java.util.*;
class conver
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String c=sc.next();
        if(c.charAt(0)>='A'&&c.charAt(0)<='Z')
            System.out.println(c.toLowerCase());
        else if(c.charAt(0)>='a'&&c.charAt(0)<='z')
            System.out.println(c.toUpperCase());
    }
}