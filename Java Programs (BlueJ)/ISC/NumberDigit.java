import java.util.*;
class NumberDigit
{
    public static void main(String args[])
    {
        int m,n,p,s,r,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of M");
        m=sc.nextInt();
        System.out.println("Enter the value of N");
        n=sc.nextInt();
        if(m>=100 && m<=10000 && n<100)
        {
            while(true)
            {
                p=m;s=0;d=0;
                while(p>0)
                {
                    r=p%10;
                    s=s+r;
                    p=p/10;
                    d++;
                }
                if(s==n)
                {
                     System.out.println("The required number = "+m);
                      System.out.println("Total number of digits = "+d);
                      break;
                    }
                    m++;
                }
            }
            else
             System.out.println("Invalid Input");
            }
        }