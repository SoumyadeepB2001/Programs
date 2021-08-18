import java.util.*;
class automorphic
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        int n,a=0,r=0,c=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        a=n;
        while(a>0)
        {
            r=a%10;
            c++;
            a=a/10;
        }
        a=n*n;
        if(a%(int)(Math.pow(10,c))==n)
        {
            System.out.println(n+" is an Automorphic Number");
        }
        else
        {
            System.out.println(n+" is not an Automorphic Number");
        }
    }
}
