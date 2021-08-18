import java.util.*;
class word
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1=sc.nextLine();
        int n=s1.length();
        System.out.print("Enter the second string of the same length: ");
        String s2=sc.nextLine();
         System.out.print("The new word is: ");
        if(n==s2.length())
        {
        for(int i=0;i<n;i++)
        {
            int p=n-i-1;
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(p);
            System.out.print(""+ch1+""+ch2);
        }
    }
    else
    System.out.println("The two strings are not of equal length");
}
}