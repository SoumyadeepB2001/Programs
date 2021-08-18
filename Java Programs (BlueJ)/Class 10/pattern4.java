import java.lang.*;
class pattern4
{
    public static void main (String args [])
    {
        int i,j,k;
        for(i=1; i<=4; i++)
        {
            for(j=4;j>=i;j=j-1)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}