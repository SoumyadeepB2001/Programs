/*
sunday
 unday
  nday
   day
    ay
     y
*/
import java.util.*;
class P53
{
    public static void main(String args[])
    {
        int i,j,l,k;
        char ch;
        String s="sunday";    
        l=s.length();
        for(i=0;i<l;i++)
        {
            for(k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(j=i;j<l;j++)
            {
                ch=s.charAt(j);
                System.out.print(ch);
            }
                System.out.println();
        }
    }
}