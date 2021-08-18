import java.util.*;
class string 
{
    public static void main(String args [])
    {
        int l,i,p,c=0,d=0,e=0,f=0;
        char ch;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            p=(int)ch;
            if(p>=65 && p<=90)
            {
                c++;
            }
            else if(p>=97 && p<=122)
            {
                d++;
            }
            else if(p>=48 && p<=57)
            {
                e++;
            }
            else
            {
                f++;
            }
        }
        System.out.println("No.of upper case letters = "+c);
        System.out.println("No.of lower case letters = "+d);
        System.out.println("No.of digits = "+e);
        System.out.println("No.of special characters = "+f);
    }
}