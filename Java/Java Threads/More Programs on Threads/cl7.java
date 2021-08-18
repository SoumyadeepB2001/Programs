class cc1 extends Thread
{
	public void run()
	{
		System.out.println("Thread c1 is running using extending");
		for(int i=0; i<5; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception ob1)
			{
			}
			System.out.println("cc1 - "+i);
		}
		System.out.println("Exiting cc1 thread");
	}
}

class cc2 extends Thread
{
	public void run()
	{
		System.out.println("Thread c2 is running using extending");
		for(int i=0; i<5; i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception ob1)
			{
			}
			System.out.println("cc2 - "+i);
		}
		System.out.println("Exiting cc2 thread");
	}
}

class cc3 extends Thread
{
	public void run()
	{
		System.out.println("Thread c3 is running using extending");
		for(int i=0; i<5; i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception ob1)
			{
			}
			System.out.println("cc3 - "+i);
		}
		System.out.println("Exiting cc3 thread");
	}
}

class cl7
{
	public static void main(String args[])
	{
		cc1 ob1 = new cc1();
		cc2 ob2 = new cc2();
		cc3 ob3 = new cc3();
		
		System.out.println("Name of the passed object "+ob1.getName());
		ob1.start();
		System.out.println("Name of the passed object "+ob2.getName());
		ob2.start();
		System.out.println("Name of the passed object "+ob3.getName());
		ob3.start();
		
		ob1.setName("Ob1 Thread");
		ob2.setName("Ob2 Thread");
		ob3.setName("Ob3 Thread");
		
		System.out.println("Main is running");
		for(int i=0; i<5; i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception ob4)
			{
			}
			System.out.println("main - "+i);
		}
		System.out.println("Name of the passed object "+ob1.getName());
		System.out.println("Name of the passed object "+ob2.getName());
		System.out.println("Name of the passed object "+ob3.getName());
		System.out.println("Exiting main thread");
	}
}


