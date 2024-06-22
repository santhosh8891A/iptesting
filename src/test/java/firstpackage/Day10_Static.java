package firstpackage;

public class Day10_Static {

	static int i = 5;//instance variable but not static
	int j = 6;//Non Static 

	public static void main(String[] args) {
		
		int k=6;//non static 
		System.out.println(i+k);
		addition();
		
	}

	public static void addition() {
		System.out.println(i );
	}

	//Non Static method	
	public void substraction()
	{
		System.out.println(j-i);
	}
}
