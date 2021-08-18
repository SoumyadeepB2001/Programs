/*
     y
    ay
   day
  nday
 unday
sunday
*/

import java.util.*;
class P54
{
    public static void main(String args[])
    {
        int i,j,l,k;
        char ch;
        String s="sunday";    
        l=s.length();
        for(i=l-1;i>=0;i--)
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