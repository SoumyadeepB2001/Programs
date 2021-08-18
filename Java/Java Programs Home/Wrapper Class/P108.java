/*
short (two constructors)
compareTo
equals
parseShort
toString
valueOf	- String to short
*/

class P108
{
	public static void main(String[] args) {
		
		Short ob1=new Short((short)55);
		Short ob2=new Short("57");
		System.out.println(ob2.equals(ob1));
		short b1=ob2;
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(b1);
		System.out.println(ob2.compareTo(ob1));
		String s1="120";
		short b2=Short.parseShort(s1);
		System.out.println(b2);

		short b3=46;
		String s2=Short.toString(b3);
		System.out.println(s2);	

		Short B1 = Short.valueOf("123");
		System.out.println(B1);

		Short B2 = Short.valueOf("10110", 2);  //A number with base 2 is converted into decimal value
        System.out.println(B2);              //Output : 22
		
	}
}
