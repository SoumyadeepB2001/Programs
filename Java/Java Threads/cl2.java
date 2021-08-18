class cl2 extends Thread {
	public void run() {
		System.out.println("Thread run() is running using extending");
	}

	public void start() {
		System.out.println("Thread start() is running using extending");
	}

	public static void main(String args[]) {
		cl2 ob = new cl2();
		Thread T = new Thread(ob);
		T.start(); // calls run()
		// ob.start(); //calls start()
	}
}
