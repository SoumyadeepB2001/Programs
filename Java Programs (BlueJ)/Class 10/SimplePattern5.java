import java.lang.*;
class SimplePattern5
{
    public static void main (String args [])
    {
        int i,j,k;
        for(i=1; i<=5; i++)
        {
            for(j=i+10;j<=i*11;j=j+10)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}