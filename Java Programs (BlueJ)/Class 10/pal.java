
import java.util.*;
class pal
{
    public static void main(String args[])
    {
        int a,n,s=0,r=0;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a number");
    n=sc.nextInt();
    a=n;
    while(a>0)
    {
        r=a%10;
        s=s*10+r;
        a=a/10;
    }
    if(s==n)
    {
    System.out.println("It is a palindrome number");
    }
    else
    {
     System.out.println("It is not a palindrome number");   
    }
   }
}
