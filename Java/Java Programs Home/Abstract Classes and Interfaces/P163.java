interface cl1
{
	void f1();
}

interface cl2 extends cl1
{
	void f2();
}

interface cl3 extends cl1
{
	void f3();
}

class cl implements cl2,cl3
{
	public void f1()
	{
		System.out.println("cl1");
	}
	public void f2()
	{
		System.out.println("cl2");
	}
	public void f3()
	{
		System.out.println("cl3");
	}
}

class P163
{
	public static void main(String args[])
	{
		cl ob = new cl();
		ob.f1();
		ob.f2();
		ob.f3();
	}
}
