class cc1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" is starting using extending");
		System.out.println("Priority is "+Thread.currentThread().getPriority());
		
		System.out.println(Thread.currentThread().getName()+" is running using extending");
	}
}
class cl1
{
	public static void main(String args[])
	{
		cc1 ob1 = new cc1();
		ob1.start();
		System.out.println("Priority is "+ob1.getPriority());
	}
}


