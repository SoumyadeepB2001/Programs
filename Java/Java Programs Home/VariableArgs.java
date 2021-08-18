import java.util.*;
class VariableArgs
{
	void f1(float s[])
	{
		System.out.println("\n"+s.length+" Float Arguments");
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}
	void f2(double s[])
	{
		System.out.println("\n"+s.length+" Double Arguments");
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}
	void f3(String s[])
	{
		System.out.println("\n"+s.length+" String Arguments");
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}
	public static void main(String[] args) {
		VariableArgs ob=new VariableArgs();
		float fl1[]={1.1f,2.2f,3.3f};
		float fl2[]={10.5f,11.6f,12.7f,13.8f,14.9f,16.0f};
		float fl3[]={0.1f,0.30f};
		ob.f1(fl1);
		ob.f1(fl2);
		ob.f1(fl3);
		double d1[]={1.1,2.2,3.3};
		double d2[]={10.5,11.6,12.7,13.8,14.9,16.0};
		double d3[]={0.1,0.30};
		ob.f2(d1);
		ob.f2(d2);
		ob.f2(d3);
		String s1[]={"I am Batman","The Three Jokers", "Apokolips War"};
		String s2[]={"One","Two", "Three","Four","Five","Six","Seven"};
		ob.f3(s1);
		ob.f3(s2);

	}
}