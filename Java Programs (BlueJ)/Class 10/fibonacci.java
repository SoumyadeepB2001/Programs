import java.util.*;
class fibonacci
{
    int fibo(int n1)
    {
        if(n1==1)
        {
            return(0);
        }
        else if(n1==2)
        {
            return(1);
        }
        else
        {
            return(fibo(n1-2)+fibo(n1-1));
        }
    }
    public static void main(String args[])
    {
        int i,n,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        fibonacci ob=new fibonacci();
        for(i=1;i<=n;i++)
        {
            k=ob.fibo(i);
            System.out.print(k+",");
        }
    }
}
        