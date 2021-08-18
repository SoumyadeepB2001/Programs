//Relation between 2 different classes

class P96 {
	int a, b;

	P96() {
		a = 0;
		b = 0;
	}

	P96(int a, int b) {
		this.a = a;
		this.b = b;
	}

	P96(cl2 ob) {
		a = ob.a;
		b = ob.b;
	}

	void display() {
		System.out.println("a = " + a + " b = " + b);
	}
}

class cl2 {
	int a, b;

	cl2() {
		a = 0;
		b = 0;
	}

	cl2(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void display() {
		System.out.println("a = " + a + " b = " + b);
	}

}

class Main {
	public static void main(String args[]) {
		cl2 ob1 = new cl2(7, 8);
		ob1.display();
		P96 ob2 = new P96(ob1);
		ob2.display();
	}
}
