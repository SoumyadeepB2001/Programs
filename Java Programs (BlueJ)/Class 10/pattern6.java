import java.lang.*;
class pattern6
{
    public static void main (String args [])
    {
        int i,j,k;
        for(i=1; i<=7; i+=2)
        {
            for(j=1;j<=i;j=j+2)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
