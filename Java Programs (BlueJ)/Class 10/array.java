import java.util.*;
class array
{
    public static void main(String args[])
    {
        int i,j,k,m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        n=sc.nextInt();
        System.out.println("Enter the number of columns");
        m=sc.nextInt();
        int a[][]=new int[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.println("Enter a number");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Original Matrix is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--)
        {
            for(j=0;j<m;j++)
            {
                k=a[i][j];
                a[i][j]=a[i-1][j];
                a[i-1][j]=k;
            }
        }
        System.out.println("The Swapped Matrix is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        }
    }

            
        