class P103
{
	public static void main(String args[])
	{
		Character ob = new Character('x');		//data type to object
		System.out.println("Value of object = "+ob);
		char c = ob.charValue();				//object to data type
		System.out.println("Value of c = "+c);
		
		Character ob2 = new Character('y');
		System.out.println(ob.compareTo(ob2));
		System.out.println(ob2.compareTo(ob));
		
		Character ob3 = new Character('x');
		System.out.println(ob.compareTo(ob3));
		System.out.println(ob3.compareTo(ob));
	}
}
		
