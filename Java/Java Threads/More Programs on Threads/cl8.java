class cc1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" is running using extending");
		for(int i=0; i<5; i++)
		{
			if(i==2)
				Thread.currentThread().setName("cc1");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception ob1)
			{
			}
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
		System.out.println("Exiting cc1 thread");
	}
}

class cc2 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" is running using extending");
		for(int i=0; i<5; i++)
		{
			if(i==2)
				Thread.currentThread().setName("cc2");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception ob1)
			{
			}
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
		System.out.println("Exiting cc2 thread");
	}
}

class cc3 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" is running using extending");
		for(int i=0; i<5; i++)
		{
			if(i==2)
				Thread.currentThread().setName("cc3");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception ob1)
			{
			}
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
		System.out.println("Exiting cc3 thread");
	}
}

class cl8
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
		
		System.out.println(Thread.currentThread().getName()+" is running using extending");
		for(int i=0; i<5; i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception ob4)
			{
			}
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
		System.out.println("Name of the passed object "+ob1.getName());
		System.out.println("Name of the passed object "+ob2.getName());
		System.out.println("Name of the passed object "+ob3.getName());
		System.out.println("Exiting main thread");
	}
}


