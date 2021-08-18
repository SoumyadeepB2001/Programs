final class cl1
{
	void f()
	{
		System.out.println("I am in super class");
	}
}

class cl2 extends cl1 //final class cannot be inherited/extended
{
	void f()
	{
		System.out.println("I am in sub class");
	}
}

class P148
{
	public static void main(String args[])
	{
		cl1 ob1 = new cl1();
		ob1.f();
	}
}

/*
P148.java:9: error: cannot inherit from final cl1
class cl2 extends cl1
                  ^
1 error
*/
