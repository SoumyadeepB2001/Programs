import java.util.*;
class cl1
{
	int a=5,b=6;
	void f1()
	{
		System.out.println("Function f1()");
		System.out.println("a = "+a+" b = "+b);
	}  
}

class cl2 extends cl1
{
	int c=7,d=8;
	void f2()
	{
		System.out.println("Function f2()");
		System.out.println("a = "+a+" b = "+b);
		System.out.println("c = "+c+" d = "+d);
	} 
}

class cl3 extends cl2
{
	int e=9,f=10;
	void f3()
	{
		System.out.println("Function f3()");
		System.out.println("a = "+a+" b = "+b);
		System.out.println("c = "+c+" d = "+d);
		System.out.println("e = "+e+" f = "+f);
	}
	public static void main(String[] args) {
		cl3 ob=new cl3();
		ob.f1();
		ob.f2();
		ob.f3();
	}
}