import java.lang.*;
class pattern5
{
    public static void main (String args [])
    {
        int i,j,k;
        for(i=8; i>=2; i-=2)
        {
            for(j=i;j>=2;j=j-2)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}