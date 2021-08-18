import java.util.*;
class num
{
    public static void main(String args[])
    {
        int n,n1,a,b,r,s=0,p=1,s1=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number with four or more digits"); //To accept a number from the user      
        n=sc.nextInt();
        if(n>=1000) //To check if the number is valid or not
        {
            a=n%10; //To extract the last digit of the number
            n1=n;
            while(n1>0) //To reverse the number
            {
                r=n1%10;
                s=s*10+r;
                n1=n1/10;
            }
            b=s%10; //To extract the last digit of the reversed number
            n1=n;
            while(n1>0)
            {
                r=n1%10;
                s1=s1+r;
                n1=n1/10;
            }
            p=a*b; //Product of the first and the last digits
            s1=s1-(a+b); //Sum of the middle digits
            System.out.println("Sum of the middle digits= "+s1);
            System.out.println("Product of the first and the last digits= "+p);
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
}
    