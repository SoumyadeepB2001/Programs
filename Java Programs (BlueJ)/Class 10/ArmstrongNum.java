import java.util.*;
class ArmstrongNum
{
    int r;
    int cube(int n, int s)
    {
        if(n==0)
        {
            return(s);
        }
        else
        {
            r=n%10;
            s=s+r*r*r;
            return(cube((n/10),s));
        }
    }
    public static void main(String args[])
    {
        int n1,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n1=sc.nextInt();
        ArmstrongNum ob=new ArmstrongNum();
        k=ob.cube(n1,0);
        if(k==n1)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
        }
    }
}