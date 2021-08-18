interface cl1
{
	default void f1()
	{
		System.out.println("cl1");
	}
}

class cl2 implements cl1
{
	public void f1()
	{
		System.out.println("cl2");
	}
}

class P165
{
	public static void main(String args[])
	{
		cl2 ob = new cl2();
		ob.f1();
	}
}
