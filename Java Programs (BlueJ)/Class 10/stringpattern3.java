import java.util.*;
class stringpattern3
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
        for(i=0;i<=l;i++)
        {
            System.out.println(s.substring(i,l));
        }
    }
}