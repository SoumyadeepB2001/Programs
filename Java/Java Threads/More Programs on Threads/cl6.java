class ca1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread ca1 is running using implements");
		for(int i=0; i<5; i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception ob1)
			{
			}
			System.out.println("ca1 - "+i);
		}
		System.out.println("Exiting ca1 thread");
	}
}

class ca2 implements Runnable
{
	public void run()
	{
		System.out.println("Thread ca2 is running using implements");
		for(int i=0; i<5; i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception ob1)
			{
			}
			System.out.println("ca2 - "+i);
		}
		System.out.println("Exiting ca2 thread");
	}
}

class ca3 implements Runnable
{
	public void run()
	{
		System.out.println("Thread ca3 is running using implements");
		for(int i=0; i<5; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception ob1)
			{
			}
			System.out.println("ca3 - "+i);
		}
		System.out.println("Exiting ca3 thread");
	}
}

class cl6
{
	public static void main(String args[])
	{
		ca1 ob1 = new ca1();
		Thread t1 = new Thread(ob1);
		ca2 ob2 = new ca2();
		Thread t2 = new Thread(ob2);
		ca3 ob3 = new ca3();
		Thread t3 = new Thread(ob3);
		t1.start();
		t2.start();
		t3.start();
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
		System.out.println("Exiting main thread");
	}
}


