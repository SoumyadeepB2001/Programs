import java.lang.*;
class pattern12
{
    public static void main (String args [])
    {
        int i,j,k=1;
        for(i=1; i<=5; i=i+1)
        {
            for(j=1;j<=i;j=j+1)
            {
                System.out.print(k+",");
                k++;
            }
            System.out.println();
        }
    }
}