import java.util.*;
class FirstLetter
       {
    public static void main(String args [])
       {
        int i,l;
        String s,s1="";
        char ch,ch1;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        s=" "+s;
        l=s.length();
        for(i=0;i<l;i++)
        {
        ch=s.charAt(i);
        if(ch==' ')
        {
            ch1=s.charAt(i+1);
            System.out.println(ch1);
        }
        }
        }
        }
 