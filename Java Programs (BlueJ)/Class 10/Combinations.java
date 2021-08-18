import java.util.*;
class Combinations
{
    public static void main(String args[])
    {
        String s;
        int h,i,j,k,l;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string of length 4");
        s=sc.nextLine();
        l=s.length();
        System.out.println("Combinations of "+s+" are:");
        for(h=0;h<l;h++)
        {
            for(i=0;i<l;i++)
            {
                for(j=0;j<l;j++)
                {
                    for(k=0;k<l;k++)
                    {
                        if(h!=i&&i!=j&&j!=k&&k!=h)
                        System.out.println(s.charAt(h)+""+s.charAt(i)+""+s.charAt(j)+""+s.charAt(k));
                    }
                }
            }}
        }
        }