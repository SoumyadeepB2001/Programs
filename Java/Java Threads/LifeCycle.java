class LifeCycle implements Runnable
{  
	public void run()
	{  		
			System.out.println(Thread.currentThread().getName()+" is in "+Thread.currentThread().getState()+" state");
	}
}
class Main
{
	public static void main(String args[]) 
	{  
		try
		{
			Thread t = new Thread(new LifeCycle());
			System.out.println("State of "+t.getName()+" after creation is "+t.getState());
			t.start();
			Thread.sleep(200);
			System.out.println("State of "+t.getName()+" after termination is "+t.getState());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}		
	} 
}