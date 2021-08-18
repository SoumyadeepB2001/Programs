
import java.lang.*;
class patterns
{
    public static void main (String args [])
    {
        int i,j,a=1;
        for(i=1; i<=5; i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}

            