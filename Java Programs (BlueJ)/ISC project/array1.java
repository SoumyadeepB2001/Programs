import java.util.*;
class array1
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int t,i,j;
      int a[][]=new int[3][3];
    
      for(i=0;i<3;i++)
      {
          for(j=0;j<3;j++)
          {
              System.out.println("Enter the values");
              a[i][j]=sc.nextInt();
            }
      }
      System.out.println("Original Array");
      for(i=0;i<3;i++)
      {
          for(j=0;j<3;j++)
          {
              System.out.print(a[i][j]+" ");
              
            }
          System.out.println();
      }
       System.out.println("Mirror  Array");
      for(i=0;i<3;i++)
      {
            t=a[i][0];
            a[i][0]=a[i][2];
            a[i][2]=t;                                                                                                         
      }
      for(i=0;i<3;i++)
      {
          for(j=0;j<3;j++)
          {
              System.out.print(a[i][j]+" ");
              
            }
            System.out.println();
      }
    }
}
