import java.util.*;
class encoding
{
    public static void main(String args[])
    {
        int i,l,p;
        char ch;
        String s,s1="";
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
        s=s.toUpperCase();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch>='D'&& ch<='Z')
            {
                p=(int)ch-3;
                s1=s1+(char)p;
            }
            else if(ch>='A'&&ch<='C')
            {
                p=(int)ch+(26-3);
                s1=s1+(char)p;
            }
            else
            {
                s1=s1+ch;
            }
        }
        System.out.println(s+" = "+s1);
    }
}