/*
1. a + ib -> Input a,b
2. default constructor
3. Parameterised constructor
4. Display function
5. add() -> object as parameter
6. sub, mul, div
*/

class P93 {
	int a, b;

	P93() {
		a = 0;
		b = 0;
	}

	P93(int a, int b) {
		this.a = a; // this.a -> instance variable, a -> parameter
		this.b = b;
	}

	void display() {
		if (b >= 0)
			System.out.println(a + " + i" + b);
		else
			System.out.println(a + " - i" + (b * -1));
	}

	P93 add(P93 ob2) {
		P93 ob = new P93();
		ob.a = this.a + ob2.a; // this.a -> 2 ob2.a -> 4
		ob.b = this.b + ob2.b; // this.b -> 3 ob2.b -> 5

		return ob; // return object ob -> ob3
	}
}

class cl {
	public static void main(String args[]) {
		P93 ob1 = new P93(2, 3);
		P93 ob2 = new P93(4, 5);
		P93 ob3 = new P93();
		ob3 = ob1.add(ob2);
		ob3.display();
	}
}
