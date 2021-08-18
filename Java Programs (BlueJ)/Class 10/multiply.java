import java.util.*;
 class multiply
 {
    public static void main(String args[])
    {
        int i,j,k,p,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        int c[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter the values for the first matrix");
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter the values for the second matrix");
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("The first matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
         System.out.println("The second matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The final matrix after multiplication");
       for(i=0;i<n;i++)
       {
           for(j=0;j<n;j++)
           {
               p=0;
               for(k=0;k<n;k++)
               {
                   p=p+(a[i][k]*b[k][j]);
                   c[i][j]=p;
               }
               System.out.print(c[i][j]+" ");
               }
               System.out.println();
               }
            }
        }
            