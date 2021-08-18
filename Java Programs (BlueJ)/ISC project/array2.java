import java.util.*;
class array2
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,j,i;
      System.out.println("Enter the value of n");
      n=sc.nextInt();
      int a[][]=new int[n][n];
      for(i=0;i<n;i++)
        {
          for(j=0;j<n;j++)
          {
              System.out.println("Enter the values");
              a[i][j]=sc.nextInt();
            }
         }
      System.out.println("THE RIGHT DIAGONAL");   
      for(i=0;i<n;i++)
       {
          for(j=0;j<n;j++)
          {
            if((i+j)==(n-1))
            {
                System.out.print(a[i][j]);
            }
            else
            {
              System.out.print("  ");   
            }
          }
           System.out.println();
           System.out.println();
        }
    }
}
