import java.util.*;
class sentence2
{
     public static void main(String args[])
    {
        int i,l,p=0;
        String s,s1="";
        char ch;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String");
        s=sc.nextLine();
        s=s+"  ";
        l=s.length();
        for(i=0;i<l;i++)
         {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                s1=s1+ch;
            }
            else
            {
                System.out.println(s1);
            s1="";
        }
        }
    }
}
 