import java.util.*;
class string1
{
    public static void main(String args[])
    {
        String s;
        int i,j,k,l;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a three-letter word");
        s=sc.nextLine();
        l=s.length();
        System.out.println("THE REQUIRED COMBINATIONS OF THE WORD:");
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
                for(k=0;k<l;k++)
                {
                    if(i!=j&&j!=k&&k!=i)
                    {
                      System.out.println(s.charAt(i)+""+s.charAt(j)+""+s.charAt(k));
                    }
                }
                System.out.println();
            }
        }
    }
}

    