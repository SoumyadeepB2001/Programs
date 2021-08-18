class cc1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" is starting using extending");
		System.out.println("Priority is "+Thread.currentThread().getPriority());
		
		System.out.println(Thread.currentThread().getName()+" is running using extending");
	}
}

class cl4
{
	public static void main(String args[])
	{
		cc1 ob1 = new cc1();
		System.out.println("Priority is "+ob1.getPriority());
		ob1.start();
		ob1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Priority is "+ob1.getPriority());
	}
}


