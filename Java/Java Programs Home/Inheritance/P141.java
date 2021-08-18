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

class P141
{
	public static void main(String args[])
	{
		cl1 ob1 = new cl1();
		ob1.f();
		cl1 ob2 = new cl2();	//runtime polymorphism
		ob2.f();
	}
}

