import java.lang.*;
class hw3
{
    public static void main (String args [])
    {
        int i,j,k,m,n;
        for(i=3; i>=1; i--)
        {
            for(k=3;k>i;k--)
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
            {
              System.out.print(j);  
            }
            System.out.println();
        }
    }
}
