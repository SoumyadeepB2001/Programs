import java.util.*;
class special
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        int n,r,i,a;
        double s=0,f=1;
        System.out.println ("Enter a number");
        a= sc.nextInt();
        n=a;
        while(n>0)
        {
            r=n%10;
            for(i=1;i<=r;i++)
            {
                f=f*i;
            }
                s=s+f;
                n=n/10;
                f=1;
        }
        if(s==a)
        {
            System.out.println("Special number");
        }
        else
        {
            System.out.println("Not a Special number");
        }
    }
}
