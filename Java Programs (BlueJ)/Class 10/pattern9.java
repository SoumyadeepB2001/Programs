import java.lang.*;
class pattern9
{
    public static void main (String args [])
    {
        int i,j,k;
        for(i=2; i<=8; i=i+2)
        {
            for(j=i;j<=8;j=j+2)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}