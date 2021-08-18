/*
Byte (two constructors)
compareTo
equals
parseByte
toString
valueOf	- String to byte
*/

class P107
{
	public static void main(String[] args) {
		
		Byte ob1=new Byte((byte)55);
		Byte ob2=new Byte("57");
		System.out.println(ob2.equals(ob1));
		byte b1=ob2;
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(b1);
		System.out.println(ob2.compareTo(ob1));
		String s1="120";
		byte b2=Byte.parseByte(s1);
		System.out.println(b2);

		byte b3=46;
		String s2=Byte.toString(b3);
		System.out.println(s2);	

		Byte B1 = Byte.valueOf("123");
		System.out.println(B1);

		Byte B2 = Byte.valueOf("10110", 2);  //A number with base 2 is converted into decimal value
        System.out.println(B2);              //Output : 22
		
	}
	
}
