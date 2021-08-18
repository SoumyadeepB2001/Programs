import java.util.*;
class MatrixSort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m,n,i,j,k,t;
        System.out.println("Enter number of rows and columns");
        m=sc.nextInt();
        n=sc.nextInt();
        if(m<=2 && m>=20 || n<=2 && n>=20)
        {
            System.out.println("Matrix size Out of Range");
        }
        else
        {
            int num[][]=new int[m][n];
            System.out.println("Enter Matrix Elements");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    num[i][j]=sc.nextInt();
                }
            }
                System.out.println("Original Matrix");
                for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)                
                System.out.print(num[i][j]+"\t");
                System.out.println();
            }
            for(i=0;i<m;i++)
            {
                for(j=0;j<(n-1);j++)
                {
                    for(k=0;k<(n-1-j);k++)
                    {
                        if(num[i][k]>num[i][k+1])
                        {
                            t=num[i][k];
                            num[i][k]=num[i][k+1];
                            num[i][k+1]=t;
                        }
                    }
                    }
                }
                System.out.println("Matrix after sorting rows");
                for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)                
                System.out.print(num[i][j]+"\t");
                System.out.println();
            }
        }
        }
    }
                