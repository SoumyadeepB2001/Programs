import java.util.*;
class loop
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        int n,i,f=1;
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of "+n+" = "+f);
    }
}
        