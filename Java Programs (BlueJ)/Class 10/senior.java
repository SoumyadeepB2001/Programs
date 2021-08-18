import java.util.*;
class senior
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        double a;
        System.out.println ("Enter your age");
        a=sc.nextInt();
        if (a>=60)
        {
            System.out.println("You are a senior citizen");
        }
        else
        {
            System.out.println("You are not a senior citizen");
        }
    }
}
            