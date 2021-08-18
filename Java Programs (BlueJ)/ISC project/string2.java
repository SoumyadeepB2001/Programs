import java.util.*;
class string2
{
    public static void main(String args[])
    {
        String s,s1="";
        int i,l,p;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
          ch=s.charAt(i);
          if((ch>='A' && ch<='W') || (ch>='a' && ch<='w')) 
          {
              p=(int)ch+3;
              s1=s1+(char)p;
          }
          else if((ch>='X' && ch<='Z') || (ch>='x' && ch<='z'))
          {
              p=(int)ch-(26-3);
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
            
         