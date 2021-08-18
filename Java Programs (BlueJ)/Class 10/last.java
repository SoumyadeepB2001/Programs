import java.util.*;
public class last
    {
    public static void main(String args[])
    {
        int i,j,l;
        char ch,ch1;
        String s,s1="";
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
        s=s+" ";
        s=s.toUpperCase();
        l=s.length();
        for(i=0;i<l-1;i++)
        {
            ch=s.charAt(i);
            ch1=s.charAt(i+1);
            if(ch==ch1)
            {
                continue;
            }
            else
            {
                s1=s1+ch;
            }
        }
        System.out.println(s1);
    }
}
          