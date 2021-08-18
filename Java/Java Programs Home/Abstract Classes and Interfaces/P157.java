interface cl1
{
	int a=5;		//public, static and final by default
	void output();	//public and abstract by default
}

class cl2 implements cl1
{
	public void output()
	{
		System.out.println("class cl2 "+a);
	}
}

class cl3 implements cl1
{
	public void output()
	{
		System.out.println("class cl3 "+a);
	}
}

class P157
{
	public static void main(String args[])
	{
		cl2 ob1 = new cl2();
		ob1.output();
		System.out.println("Value of a in main function is "+ob1.a);
		
		cl3 ob2 = new cl3();
		ob2.output();
		System.out.println("Value of a in main function is "+ob2.a);
	}
}

