import java.util.*;
class f1
{
    public static void main(String args[])
    {
        int i,l;
        char ch;
        String s,s1,s2="";
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a name");
        s=sc.nextLine();
        System.out.println("Enter the middle name to be added");
        s1=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
            {
            ch=s.charAt(i);
            if(ch==' ')
            {
              s2=s2+" "+s1+" ";
            }
            else
            {
                s2=s2+ch;
            }
        }
        System.out.println(s2);
    }
}
                