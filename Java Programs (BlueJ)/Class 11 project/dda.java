//To create a n X n matrix in double dimensional array and print the left and right diagonals and their sums
import java.util.*;
class dda
{
    public static void main(String args[])
    {
    int i,j,n,s=0,s1=0;
    Scanner sc=new Scanner(System.in);
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
    System.out.println();
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
           if((i==j)||(i+j==n-1))
           {
               System.out.print(a[i][j]+"   ");
           }
           else
           {
               System.out.print("  ");
           }
        }
        System.out.println();
    }
    
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
         if(i==j)
         {
           s=s+a[i][j];
         }
         if(i+j==n-1)
         {
             s1=s1+a[i][j];
         }        
        }
         System.out.println();
    }
    System.out.println("SUM OF ELEMENTS OF THE LEFT DIAGONAL = "+s);
    System.out.println("SUM OF ELEMENTS OF THE RIGHT DIAGONAL = "+s1); 
  }
}