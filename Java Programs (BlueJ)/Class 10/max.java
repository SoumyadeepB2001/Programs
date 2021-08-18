import java.util.*;
class max
{
    public static void main(String args[])
    {
        int max=0,a,n,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a=sc.nextInt();
        n=a;
        while(n>0)
        {
            r=n%10;
            if(r>max)
            {
                max=r;
            }
            n=n/10;
        }
        System.out.println("The greatest digit present in the number "+a+ " is = "+max);
    }
}
