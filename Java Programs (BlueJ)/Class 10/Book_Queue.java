import java.util.*;
class Book_Queue
{
    String st[]=new String[100];
    int capacity,f,r;
    Book_Queue(int k)
    {
        capacity=k;
        f=-1;
        r=-1;
    }
    void pushvalue(String v)
    {
        if(r==capacity-1)
        System.out.println("Queue Overflows");
        else
        {
            if(f==-1 && r==-1)
            {
                f=0;
                r=0;
            }
            else
            r=r+1;
            st[r]=v;
        }
    }
    void popvalue()
    {
        if(r==-1 && f==-1)
        System.out.println("Queue Underflows");
        else
        {
            if(f==r)
            {
                f=-1;
                r=-1;
            }
            else
            f=f+1;
        }
    }
    void display()
    {
        if(f==-1 && r==-1)
        {
        System.out.println("Books on the queue:");
        System.out.println("Queue Underflows");
    }
        else
        {
            System.out.println("Books on the queue:");
            for(int i=f;i<=r;i++)
            System.out.println(st[i]);
        }
    }
    public static void main(String args[])
    {
        int c,n,m,i=1;
        String s;
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the capacity of the queue");
      c=sc.nextInt();
     Book_Queue ob = new Book_Queue(c);
      System.out.println("How many books do you want to add to the queue ?");
      n=sc.nextInt();
      while(i<=n)
      {
          System.out.println("Add a book to the queue");
          s=sc.next();
          ob.pushvalue(s);
          i++;
      }
      ob.display();
      System.out.println("How many books do you want to remove from the queue ?");
      m=sc.nextInt();
      i=1;
      while(i<=m)
      {
          ob.popvalue(); 
          i++;
    }
    ob.display();
}}
    