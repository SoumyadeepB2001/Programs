class cl1 extends Thread
{
    public void run()
    {
    try
    {
    System.out.println("Priority of "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority());
    Thread.currentThread().setPriority(1);
    System.out.println("Priority of "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority());
    }
    catch(Exception e)
    {
    System.out.println("Exception is caught");
    }
    }
    }
    
    class cl2 extends Thread{
    public void run()
    {
    try
    {
    System.out.println("Priority of "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority());
    Thread.currentThread().setPriority(3);
    System.out.println("Priority of "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority());
    }
    catch(Exception e){
    System.out.println("Exception is caught");
    }
    }
}
 
class Main
{
    public static void main(String[]args)
    {
    System.out.println("Start of main()");  
    cl1 ob1=new cl1();
    ob1.start();    
    cl2 ob2=new cl2();
    ob2.start();  
    System.out.println("End of main()");
    }
}