import java.lang.*;
class pattern15
{
    public static void main (String args [])
    {
        int i,j,k;
        for(i=1; i<=5; i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            for(k=i+1;k<=5;k++)
                {
                    System.out.print(k);
                }
                
            System.out.println();
        }
    }
}
