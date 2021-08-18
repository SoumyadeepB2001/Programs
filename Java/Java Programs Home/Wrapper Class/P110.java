/*
float (two constructors)
compareTo
equals
parseFloat
toString
valueOf	- String to float
*/

class P110
{
	public static void main(String[] args) {
		
		Float ob1=new Float((float)55.5);
		Float ob2=new Float("57");
		System.out.println(ob2.equals(ob1));
		float b1=ob2;
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(b1);
		System.out.println(ob2.compareTo(ob1));
		String s1="120";
		float b2=Float.parseFloat(s1);
		System.out.println(b2);

		float b3=46;
		String s2=Float.toString(b3);
		System.out.println(s2);	
		
	}
	
}
