import java.lang.*;
class pattern3
{
    public static void main (String args [])
    {
        int i,j,k;
        for(i=7; i>=1; i-=2)
        {
            for(j=7;j>=i;j-=2)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
