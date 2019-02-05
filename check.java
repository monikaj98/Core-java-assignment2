import java.util.*;
class check
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c='$';
        if(c>=65&&c<=90||c>=97||c<=122)
            System.out.println("Char is alphabet");
        else if(c>=48&&c<=57)
            System.out.println("digits");
        else
            System.out.println("special characters");
    }
}