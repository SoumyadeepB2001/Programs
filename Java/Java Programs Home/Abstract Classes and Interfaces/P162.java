interface cl1
{
	void f1();
	void f2();
}

class cl2 implements cl1
{
	int a;
	public void f1()
	{
		 a=9;
	}
	public void f2()
	{
		System.out.println("a = "+a);
	}
}

class cl3 implements cl1
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

class P162
{
	public static void main(String args[])
	{
		cl2 ob1 = new cl2();
		ob1.f1();
		ob1.f2();
		cl3 ob2 = new cl3();
		ob2.f1();
		ob2.f2();
	}
}
