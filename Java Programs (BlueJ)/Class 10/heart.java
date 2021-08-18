import java.util.*;
class heart
{
    public static void main(String args[])
    {
        int i,j,k=7;

        for(i=2;i<=5;i++)
        {
            for(j=1;j<=7;j++)
            {
                if(j==i-1 || (j==k) || (j==i*i))
                {
                    System.out.print("*");
                    
                }
                
                else
                {
                    System.out.print(" ");
                    
                }
            }
            k--;
            System.out.println();
        }
    }
}