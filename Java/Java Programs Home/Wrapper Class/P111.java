//double

class P11{
	public static void main(String[] args) {
		
		Double ob1=new Double(55.5);
		Double ob2=new Double("57");
		System.out.println(ob2.equals(ob1));
		double b1=ob2;
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(b1);
		System.out.println(ob2.compareTo(ob1));
		String s1="120";
		double b2=Double.parseDouble(s1);
		System.out.println(b2);

		double b3=46;
		String s2=Double.toString(b3);
		System.out.println(s2);	
		
	}
}
