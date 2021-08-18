class cl1
{
	void f()
	{
		System.out.println("I am in super class");
	}
}

class cl2 extends cl1
{
	void f()
	{
		System.out.println("I am in sub class cl2");
	}
}

class cl3 extends cl2
{
	void f()
	{
		System.out.println("I am in sub class cl3");
	}
}

class P140
{
	public static void main(String args[])
	{
		cl1 ob1 = new cl1();
		ob1.f();
		cl2 ob2 = new cl2();
		ob2.f();
		cl3 ob3 = new cl3();
		ob3.f();
	}
}

