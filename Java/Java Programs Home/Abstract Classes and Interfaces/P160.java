interface cl1
{
	void f1();
}

interface cl2 extends cl1 //An interface can extend (not implement) another interface
{
	void f2();
}

class cl3 implements cl2
{
	int a;
	public void f1()
	{
		a=5;
	}
	public void f2()
	{
		System.out.println("a = "+a);
	}
}

class P160
{
	public static void main(String args[])
	{
		cl3 ob = new cl3();
		ob.f1();
		ob.f2();
	}
}
