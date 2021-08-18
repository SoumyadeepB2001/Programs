import java.lang.*;
class pat
{
    public static void main (String args [])
    {
        int i,j,k,m,n;
        for(i=4; i>=1; i--)
        {
            for(k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<i;j++)
            {
              System.out.print(j);  
            }
            System.out.println();
        }
    }
}