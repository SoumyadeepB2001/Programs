import java.lang.*;
class pattern13
{
    public static void main (String args [])
    {
        int i,j,k=1;
        for(i=5; i>=1; i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k);
                k++;
                
            }
            System.out.println();
        }
    }
}