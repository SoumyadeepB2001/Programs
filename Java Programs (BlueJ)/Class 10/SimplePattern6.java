import java.lang.*;
class SimplePattern6
{
    public static void main(String args [])
    {
        int i,j,m;
        for(i=1;i<=4;i++)
        {
            for(j=4;j>i;j--)
            {
                System.out.print(" ");
            }
            for(m=1;m<=i;m++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
            
        