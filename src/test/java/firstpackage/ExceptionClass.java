package firstpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionClass {

	public static void main(String[] args) throws FileNotFoundException  {
		File file= new File("sasam.txt");
		FileInputStream filio=new FileInputStream(file);
		 

	}

}
