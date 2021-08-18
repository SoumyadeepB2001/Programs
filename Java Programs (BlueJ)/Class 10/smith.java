import java.util.*;
class smith
{
    int k,n,a=0,r=0,j,i,c=0,sum=0,s=0,n2,r1,a1;
    boolean b1;
    public int input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return(0);
        }
        else
        {
            return(n);
        }
    }
    public boolean check(int n1) 
    {
        c=0;
        i=2;
        n2=n1;
        while(i<=n2)
            {                        
                a=i;
                c=0;
                for(j=1;j<=a;j++)
                {
                    if(a%j==0)
                    {
                        c++;
                    }
                }
            
                if(c==2 && (n2%i)==0)
                {
                    n2=n2/i;
                    a=i;
                    while(a>0)
                    {
                        r=a%10;
                        sum=sum+r;
                        a=a/10;
                    }
                }
                    
                else
                {
                    i++;
                }
        }
        a1=n1;
        while(a1>0)
        {
            r1=a1%10;
            s=s+r1;
            a1=a1/10;
        }
    
        if(s==sum)
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    void display(boolean b1)
    {
        if(b1==true)
        {
            System.out.println("Smith Number");
        }
        else
        {
           System.out.println("Not a Smith Number"); 
        }
    }     
public static void main(String args[])
{
    int k;
    boolean l;
    smith ob=new smith();
    k=ob.input();
    if(k>0)
    {
        l=ob.check(k);
        ob.display(l);
    }
    else
    {
     ob.display(false);  
    }
}
}

