import java.lang.*;
class pattern17
{
    public static void main  (String args [])
    {
        int i,j,m;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(m=5;m>=i;m--)
            {
                System.out.print(m);
            }                   
            System.out.println();
        }
    }
}