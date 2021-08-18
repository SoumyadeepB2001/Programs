import java.util.*;
class even_places
{
    public static void main(String args[])
    {
        int a,n,c=0,d=0,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        a=n;
        while(a>0)
        {
            c++;
            a=a/10;
        }
        a=n;
        while(a>0)
        {
            r=a%10;
            d++;
            if(c%2==1 && d%2==0)
            {
                System.out.print(r+" ");
            }
            else if(c%2==0 && d%2==1)
            {
                 System.out.print(r+" ");
                }
                a=a/10;
            }
        }
    }