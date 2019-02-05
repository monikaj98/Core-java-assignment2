import java.util.*;
class color
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        switch(c)
        {
                case('r'):
                System.out.println("red");
                break;
                case('g'):
                System.out.println("green");
                break;
                case('w'):
                System.out.println("white");
                break;
                case('b'):
                System.out.println("blue");
                break;
                case('o'):
                System.out.println("orange");
                break;
                case('y'):
                System.out.println("yellow");
                break;
            default:
                System.out.println("invalid");
        }
        
    }
}