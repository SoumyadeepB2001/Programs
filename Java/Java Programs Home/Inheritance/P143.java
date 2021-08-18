class cl1
{
	static void f()
	{
		System.out.println("I am in super class");
	}
}

class cl2 extends cl1
{
	static void f()
	{
		System.out.println("I am in sub class cl2");
	}
}

class P143
{
	public static void main(String args[])
	{
		cl1 ob1 = new cl1();
		ob1.f();
		cl1 ob2 = new cl2();	//runtime polymorphism ob2 is a reference variable of super class so when f() is executed, f() of super class is called
		//dynamic polymorphism is done in runtime, javac does not understand which method is called in compile time. only jvm decides which method will be called at the runtime
		ob2.f();
	}
}

