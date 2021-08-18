/*
integer
two constructor
equals
compareTo
parseInt
toString
valueOf
*/

class P112{
	public static void main(String[] args) {
		
		Integer ob1=new Integer(55);
		Integer ob2=new Integer("57");
		System.out.println(ob2.equals(ob1));
		int b1=ob2;
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(b1);
		System.out.println(ob2.compareTo(ob1));
		String s1="120";
		int b2=Integer.parseInt(s1);
		System.out.println(b2);

		int b3=46;
		String s2=Integer.toString(b3);
		System.out.println(s2);	

		Integer B1 = Integer.valueOf("123");
		System.out.println(B1);

		Integer B2 = Integer.valueOf("10110", 2);  //A number with base 2 is converted into decimal value
        System.out.println(B2);              //Output : 22
		
	}

}
