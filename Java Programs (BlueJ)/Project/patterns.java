import java.util.*;
class patterns
{
    public static void main(String args[])
    {
        int i,j,k,l,ch1;
        String s;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string then enter your choice");
        s=sc.nextLine();
        s=s.toUpperCase();
        l=s.length();
        System.out.println("Enter 1 to print the first pattern");
        System.out.println("Enter 2 to print the second pattern");
        ch1=sc.nextInt();
        switch(ch1)
         { 
         case 1:
         for(i=0;i<=l-1;i++)
          {
            for(k=l-1;k>i;k--)
            {
                System.out.print(" ");
            }
            for(j=i;j>=0;j--)
            {
            ch=s.charAt(j);
            System.out.print(ch);
            }
            System.out.println();
         }
         break;
         case 2:
         for(i=l-1;i>=0;i--)
         {
            for(j=l-1;j>=i;j--)
            {
                ch=s.charAt(j);
                System.out.print(ch);
            }
            System.out.println();
          }
          break;
          default:
          System.out.println("WRONG CHOICE");
        }
    }
}

        
            
        