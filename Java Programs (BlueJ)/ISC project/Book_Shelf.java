
import java.util.*;
class Book_Shelf 
{
    String st[]=new String[50];
    int size,top,ctr;    
    void capacity(int cap)
    {
        size=cap;
        top=-1;
        ctr=0;
    }
    void pushname(String n)
    {
        if(top==size-1)
        System.out.println("Shelf is full");
        else
        {
            top++;
            st[top]=n;
            ctr++;
        }
    }
    String popname()
    {
        String v;
        if(top==-1)
        {
            System.out.println("Shelf is empty");
            return("");
        }
        else
        {
            v=st[top];
            top--;
            ctr--;
            return(v);
        }
    }
    void display()
    {
        if(top==-1)       
        System.out.println("Shelf is empty");
            else
            {
                for(int i=top;i>=0;i--)
                {
                    System.out.println(st[i]);
                    
                }
                System.out.println("Number of books in the shelf=\t"+ctr);
                }
            }
            public static void main(String args[])
            {
                int c,i=1,j,m;
                String s="";
                Scanner sc = new Scanner(System.in);
                Book_Shelf ob = new Book_Shelf();
                System.out.println("Enter the capacity of the book shelf");
                c=sc.nextInt();
               ob.capacity(c);
                System.out.println("How many books do you want to put in the shelf ?");
                m=sc.nextInt();
                while(i<=m)
                {
                    System.out.println("Enter the name of the book");
                    s=sc.next();
                    ob.pushname(s);
                    i++;
                }
                System.out.println("The books present in the shelf are:");
                ob.display();
                System.out.println("How many books do you want to remove from the shelf ?");
                j=sc.nextInt();
                i=1;
                while(i<=j)
                {
                    ob.popname();
                    i++;
                }
                System.out.println("The books present in the shelf after removing the books are:");
                
                ob.display();
            }
}
                
                
                