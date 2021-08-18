import java.util.*;
class char_matrix
{
    public static void main(String args[])
    {
        int i,j,b,n;
        char ch1,ch2,ch3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        if(n>3&&n<10)
        {
        System.out.println("Enter three different characters");
        ch1=sc.next().charAt(0);
        ch2=sc.next().charAt(0);
        ch3=sc.next().charAt(0);
        char a[][]=new char[n][n];
        b=n-1;
        for(i=0;i<=b;i++)
        {
            for(j=0;j<=b;j++)
            {
               if((i==0 || i==b)&&(j==0 || j==b))
               {
                 a[i][j]=ch1;
                }   
               else if(i!=0 && j!=0 && i!=b && j!=b)
               {
                 a[i][j]=ch3;  
                }
                else
                {
                    a[i][j]=ch2;
                }
            }
        }
        for(i=0;i<=b;i++)
        {
            for(j=0;j<=b;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    else
    {
        System.out.println("Size out of range");
    }
}
}

