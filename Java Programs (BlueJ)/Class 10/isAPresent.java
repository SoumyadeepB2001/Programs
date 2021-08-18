import java.util.*;
class isAPresent
{
    public static void main(String args[])
    {
        int p=0,c=0,i,j,k,l,l1;
        char ch,ch1;
        String s,s1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                s1=s.substring(p,i);
                p=i+1;
            l1=s1.length();
            for(j=0;j<l1;j++)
            {
                ch1=s1.charAt(j);
                if(ch1=='A' || ch1=='a')
                {
                c=1;
                System.out.println(s1);
                break;
            }
        }
    }
}
    if(c==0)
    {
        System.out.println("No A or a Present");
    }
}
}
                
