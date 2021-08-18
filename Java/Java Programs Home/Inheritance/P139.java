class cl1
{
	void f()
	{
		System.out.println("I am in super class");
	}
}

class cl2 extends cl1
{
	void f(int x)
	{
		System.out.println("I am in sub class cl2");
	}
}

class cl3 extends cl2
{
	void f(int x)
	{
		System.out.println("I am in sub class cl3");
	}
}

class P139
{
	public static void main(String args[])
	{
		cl1 ob1 = new cl1();
		ob1.f();
		cl2 ob2 = new cl2();
		ob2.f();
		ob2.f(5);
		cl3 ob3 = new cl3();
		ob3.f();
		ob3.f(6);
		//System.out.println(ob3.f(6));
	}
}

