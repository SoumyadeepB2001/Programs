import java.util.*;
class combination
{
    public static void main(String args[])
    {
        int i,j,k,n,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1;i<=n/2+1;i++)
        {
            sum=0;
            for(j=i;j<=n/2+1;j++)
            {
                sum=sum+j;
                if(sum==n)
                break;
            }
            if(j<=n/2+1)
            {
                for(k=i;k<=j;k++)
                
                    System.out.print(k+" ");
                    System.out.println();
                
            }
        }
        }
    }