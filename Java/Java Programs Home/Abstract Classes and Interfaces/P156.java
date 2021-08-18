interface cl1
{
	int a=5;		//public, static and final by default
	void output();	//public and abstract by default
}

class cl2 implements cl1
{
	public void output()
	{
		System.out.println("1st interface program "+a);
	}
}

class P156
{
	public static void main(String args[])
	{
		cl2 ob = new cl2();
		ob.output();
		System.out.println("Value of variable a in main function is "+ob.a);
	}
}

