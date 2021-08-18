import java.lang.*;
class hw1
{
    public static void main (String args [])
    {
        int a,i,j,k,m,n;
        for(i=4; i>=1; i--)
        {
            for(k=4;k>i;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
              System.out.print(j);  
            }
            System.out.println();
        }
    }
}
