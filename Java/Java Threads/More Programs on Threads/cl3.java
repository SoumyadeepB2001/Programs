class c1 extends Thread
{
	public void run()
	{
		System.out.println("Thread c1 is running using extending");
		for(int i=0; i<5; i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception ob1)
			{
			}
			System.out.println("cl1 - "+i);
		}
		System.out.println("Exiting c1 thread");
	}
}

class c2 extends Thread
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
			System.out.println("cl2 - "+i);
		}
		System.out.println("Exiting c2 thread");
	}
}

class c3 extends Thread
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
			System.out.println("cl3 - "+i);
		}
		System.out.println("Exiting c3 thread");
	}
}

class cl2 extends Thread
{
	public static void main(String args[])
	{
		c1 ob1 = new c1();
		c2 ob2 = new c2();
		c3 ob3 = new c3();
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


