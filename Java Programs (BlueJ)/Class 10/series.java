import java.util.*;
class Series
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        int i,a,n;
        double s=0.0;
        System.out.println("Enter value of 'a'");
        a=sc.nextInt();
        System.out.println("Enter value of 'n'");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                s=s-(a/i);
            }
            else
            {
                s=s+i;
            }
        }
        System.out.println("S= "+s);
    }
}
        