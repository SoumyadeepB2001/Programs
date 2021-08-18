import java.util.*;
class spattern2
{
    public static void main(String args[])
    {
        int i,j,l,k;
        char ch;
        String s;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a word");
        s=sc.nextLine();
        s=s.toUpperCase();
        l=s.length();
        for(i=0;i<l;i++)
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
            }
        }