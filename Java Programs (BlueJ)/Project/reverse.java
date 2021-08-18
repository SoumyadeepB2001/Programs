import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        int i,l;
        String s,s1="";
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
               s1=ch+s1;
            }
            else
            {
             System.out.print(s1+" ");
             s1=""; 
            }
        }
    }
}