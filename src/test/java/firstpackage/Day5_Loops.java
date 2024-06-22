package firstpackage;

public class Day5_Loops {

	public static void main(String[] args) {

		// 1 to 10 even number -->2,4,6,8-->
		
		// 1 to 10 odd  numbers.-->1,3,5,7,9

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

	}

}
