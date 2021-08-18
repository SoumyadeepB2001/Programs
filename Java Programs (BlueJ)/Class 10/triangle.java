import java.lang.*;
class triangle
{
    public static void main (String args [])
    {
        int i,j,k;
        for(i=2; i<=8; i+=2)
        {
            for(j=8;j>i;j-=2)
            {
                System.out.print(" ");
            }
                for(k=2;k<=i;k=k+2)
                {
                    System.out.print("* ");
                   
            }
        
        System.out.println();
    }
    }
}


                    