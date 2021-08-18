import java.util.*;
class PalindromeRange
{
    public static void main(String args[])
    {
        int m,n,s=0,i,a,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of m and n (m<n) && (n<3000)");
        m=sc.nextInt();
        n=sc.nextInt();
        if(m<n && n<3000)
        {
            for(i=m;i<=n;i++)
            {
            a=i;
            s=0;
            while(a>0)
            {
                r=a%10;
                s=s*10+r;
                a=a/10;
            }
            if(s==i)
            {
            System.out.println(i);
            }
           }
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
    }
