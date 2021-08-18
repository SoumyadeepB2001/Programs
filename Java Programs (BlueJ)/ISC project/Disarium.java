import java.util.*;
class Disarium
{
    public static void main(String args[])
    {
        int n,a,c=0,r,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        a=n;
        while(a>0)
        {
            r=a%10;
            c++;
            a=a/10;
        }
        a=n;
        while(a>0)
        {
            r=a%10;
            s=s+(int)Math.pow(r,c);
            c--;
            a=a/10;
        }
        if(s==n)
        System.out.println("It is a Disarium Number");
        else
        System.out.println("It is not a Disarium Number");
        }
    }