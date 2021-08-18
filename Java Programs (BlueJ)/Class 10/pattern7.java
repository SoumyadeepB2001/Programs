import java.lang.*;
class pattern7
{
    public static void main (String args [])
    {
        int i,j,k;
        for(i=1; i<=7; i+=2)
        {
            for(j=7;j>=i;j=j-2)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}