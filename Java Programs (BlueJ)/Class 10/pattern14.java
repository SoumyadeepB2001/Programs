import java.lang.*;
class pattern14
{
    public static void main (String args [])
    {
        int i,j,k;
        for(i=1; i<=5; i++)
        {
            for(j=1;j<=i;j=j+1)
            {
                if(j%2==0)
                {
                System.out.print("0");
            }
            else
            {
                System.out.print("1"); 
            }
           }
            System.out.println();
        }
    }
}
