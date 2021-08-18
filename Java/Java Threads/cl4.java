class cl4 implements Runnable
{
	public void run()
	{
		System.out.println("run() is running");
	}
	
	public static void main(String args[])
	{
		cl4 ob = new cl4();
		//ob.start();
		//ob.run();
		Thread t = new Thread(ob);
		t.start();
	}
}
