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
		System.out.println("I am in sub class");
	}
}

class P136
{
	public static void main(String args[])
	{
		cl1 ob1 = new cl1();
		ob1.f();
		cl2 ob2 = new cl2();
		ob2.f();		//function overloading or compile time polymorphism
	}
}

