import java.util.*;
class DivisibleBy2or3
{
    public static void main (String args [])
    {
        
        Scanner sc=new Scanner (System.in);
        double a;
        System.out.println ("Enter a number to check");
        a=sc.nextDouble ();
        if (a%2==0 && a%3==0)
        {
            System.out.println(a+" is divisible by both 2 & 3");
        }
        else
        {
            System.out.println (a+" is not divisible by both 2 & 3");
        }
    }
}
        