import java.util.*; 
class mat
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        n=sc.nextInt();
        int A[][]=new int[n][n];
        int B[][]=new int[n+2][n+2];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter the values");
                A[i][j]=sc.nextInt();
                B[i+1][j+1]=A[i][j];
                if((i+j)==n-1)
                {
                B[0][n+1]+=A[i][j];
                B[n+1][0]+=A[i][j];
                }
                if(i==j)
                {
                    B[0][0]+=A[i][j];
                    B[n+1][n+1]+=A[i][j];
                }
                }
            }
            for(i=0;i<n;i++)
            {
            for(j=0;j<n;j++)
            {
                B[i+1][0]+=A[i][j];
                B[i+1][n+1]+=A[i][j];
                B[0][i+1]+=A[j][i];
              B[n+1][i+1]+=A[j][i];
            }
            }
        
        System.out.println("The Original Matrix");
            for(i=0;i<n;i++)
            {
            for(j=0;j<n;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
          System.out.println();
          }  
          System.out.println("The New Matrix");
            for(i=0;i<n+2;i++)
            {
            for(j=0;j<n+2;j++)
            {
                System.out.print(B[i][j]+"\t");
            }
          System.out.println();
          }  
        }
    }