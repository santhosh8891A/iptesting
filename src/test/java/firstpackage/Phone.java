package firstpackage;

public abstract class Phone {
	
	Phone(){
		System.out.println("I m in phone constructor");
	}
	
	abstract void camera();
	 //0% Abstraction
	public static void display()
	{
		System.out.println("Basic phone details");
	}
}
