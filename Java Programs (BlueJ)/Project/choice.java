import java.util.*;
class choice
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        int c=0,ch,n,r=0,i,a,s=0;
        System.out.println ("Enter a number then enter your choice");
        n=sc.nextInt();
        System.out.println("Enter 1 to check whether the number is a Prime number or not");
        System.out.println("Enter 2 to check whether the number is an Armstrong number or not");
        System.out.println("Enter 3 to check whether the number is a Happy number or not");
        System.out.println("Enter 4 to check whether the number is a Palindrome number or not");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println(n+" is a Prime number");
            }
            else
            {
                System.out.println(n+" is not a Prime number");
            }
            break;
            case 2:
            a=n;
            while(a>0)
            {
                r=a%10;
                s=s+(r*r*r);
                a=a/10;
            }
            if(s==n)
            {
                System.out.println(n+" is an Armstrong number");
            }
            else
            {
                System.out.println(n+" is not an Armstrong number");
            }
            break;
            case 3:
            s=n;
            while(s>9)
            {
             a=s;
             s=0;
             while(a>0)
              {
                r=a%10;
                s=s+r*r;
                a=a/10;
              }
            }
            if(s==1)
            {
                System.out.println(n+" is a Happy number");
            }
            else
            {
                System.out.println(n+" is not a Happy number");
            }
            break;
            case 4:
            a=n;
            while(a>0)
            {
                r=a%10;
                s=s*10+r;
                a=a/10;
            }
            if(s==n)
            {
                System.out.println(n+" is a Palindrome number");
            }
            else
            {
                System.out.println(n+" is not a Palindrome number");
            }
            break;
            default:
            System.out.println("WRONG CHOICE");
        }
    }
}

                
            
        
        