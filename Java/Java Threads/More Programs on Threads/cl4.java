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

class cl4 extends Thread
{
	public static void main(String args[])
	{
		cc1 ob1 = new cc1();
		cc2 ob2 = new cc2();
		cc3 ob3 = new cc3();
		ob1.start();
		ob2.start();
		ob3.start();
		System.out.println("Main is running using extending");
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
		System.out.println("Exiting main thread");
	}
}


