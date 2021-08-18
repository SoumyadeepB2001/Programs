class cl1
{
	final void f()
	{
		System.out.println("I am in super class");
	}
}	

class cl2 extends cl1
{
	void f() //final method f() cannot be overriden
	{
		System.out.println("I am in sub class");
	}
}

class P147
{
	public static void main(String args[])
	{
		cl1 ob1 = new cl1();
		ob1.f();
	}
}

/*
P147.java:11: error: f() in cl2 cannot override f() in cl1
	void f()
	     ^
  overridden method is final
*/
