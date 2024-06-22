package firstpackage;

class Counter {
	static int count = 0;// belongs to class

	Counter() {
		count++;// incrementing value
		System.out.println(count);
	}

	public static void main(String args[]) {
		// Creating objects
		Counter c1 = new Counter();// 1st instance
		Counter c2 = new Counter();// 2nd instance
		Counter c3 = new Counter();// 3rd instance
	}
}
