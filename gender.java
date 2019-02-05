import java.util.*;
class gender
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String gender=sc.next();
        int age=sc.nextInt();
        if(gender=="female"&&age>=1||age<=58)
        {
            System.out.println("Interest=8.2%");
        }
        else if(gender=="female"&&age>=59||age<=120)
        {
            System.out.println("Interest=7.6%");
        }
        else if(gender=="male"&&age>=1||age<=60)
        {
            System.out.println("Interest=9.2%");
        }
        else if(gender=="male"&&age>=61||age<=120)
        {
            System.out.println("Interest=8.3%");
        }
    }
}