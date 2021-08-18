import java.util.*;
class stringpattern
{
    public static void main(String args [])
    {
        int i,l;
        String s,s1="";
        char ch;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a word");
        s=sc.nextLine();
        l=s.length();
        for(i=l-1;i>=0;i--)
        {
         
            ch=s.charAt(i);
            s1=s1+ch;
            System.out.print(s1);
            System.out.println();
        }
    }
}