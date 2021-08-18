interface cl1
{
	default void f1()
	{
		System.out.println("cl1");
	}
}

interface cl2 extends cl1
{
	default void f1()
	{
		System.out.println("cl2");
	}
}

interface cl3 extends cl1
{
	default void f1()
	{
		System.out.println("cl3");
	}
}

class cl4 implements cl2,cl3
{
	public void f1()
	{
		System.out.println("cl4");
	}
}

class P167
{
	public static void main(String args[])
	{
		cl4 ob = new cl4();
		ob.f1();
	}
}
