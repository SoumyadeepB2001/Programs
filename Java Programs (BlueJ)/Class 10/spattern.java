import java.util.*;
class spattern
{
    public static void main(String args[])
    {
        int i,j,l;
        char ch;
        String s;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a word");
        s=sc.nextLine();
        s=s.toUpperCase();
        l=s.length();
        for(i=l-1;i>=0;i--)
        {
            for(j=0;j<=i;j++)
            {
                ch=s.charAt(j);
                System.out.print(ch);
                }
                    System.out.println();
                }
            }
        }