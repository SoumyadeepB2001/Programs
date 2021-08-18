import java.util.*;
class transpose
{
    public static void main(String args[])
    {
        int n,m,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n and m");
        n=sc.nextInt();
        m=sc.nextInt();
        int a[][]=new int[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.println("Enter the values");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The original matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(a[i][j]+"   ");
            }
            System.out.println();
        }
        int b[][]=new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=a[j][i];
            }
        }
        System.out.println("The transpose matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                 System.out.print(b[i][j]+"   ");
            }
             System.out.println();
        }
    }
}
        
            