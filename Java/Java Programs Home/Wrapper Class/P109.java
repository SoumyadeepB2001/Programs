/*
long (two constructors)
compareTo
equals
parseLong
toString
valueOf	- String to long
*/

class P109
{
	public static void main(String[] args) {
		
		Long ob1=new Long((long)55);
		Long ob2=new Long("57");
		System.out.println(ob2.equals(ob1));
		long b1=ob2;
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(b1);
		System.out.println(ob2.compareTo(ob1));
		String s1="120";
		long b2=Long.parseLong(s1);
		System.out.println(b2);

		long b3=46;
		String s2=Long.toString(b3);
		System.out.println(s2);	

		Long B1 = Long.valueOf("123");
		System.out.println(B1);

		Long B2 = Long.valueOf("10110", 2);  //A number with base 2 is converted into decimal value
        System.out.println(B2);              //Output : 22
		
	}
}
