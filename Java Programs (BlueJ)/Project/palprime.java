import java.util.*;
class palprime
{
    public static void main(String args [])
    {
        int a,b,i,c=0,r=0,s=0,n,m,k=0,swap=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers as upper bound and lower bound");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)//IN CASE THE USER ENTERS THE UPPER BOUND BEFORE THE LOWER BOUND//
        {
            swap=a;
            a=b;
            b=swap;
        }
        System.out.println("Palprime numbers between "+a+" & "+b+" : ");
        for(i=a;i<=b;i++)
        {
            n=i;
            r=0;
            s=0;
            while(n>0)
            {
                r=n%10;
                s=s*10+r;
                n=n/10;
            }
            c=0;
            for(m=1;m<=i;m++)
            {
                if(i%m==0)
                {
                    c++;
                }
            }
            if(c==2 && s==i)
            {
                k=1;
              System.out.println(i); 
            }
        }
        if(k<1)
        {
            System.out.println("No such numbers are present");
        }
    }
}

        
                
        