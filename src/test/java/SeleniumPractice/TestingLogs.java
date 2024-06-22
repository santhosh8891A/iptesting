package SeleniumPractice;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestingLogs {

	public static void main(String[] args) {

		Logger log = Logger.getLogger("orangeHRM");
		PropertyConfigurator.configure("log4j.properties");
		String status = "Fail";

		if (status.contentEquals("Pass")) {
			log.info("Maximize window size");
			log.info("enter username");
			log.info("enter password");
			log.info("click on login");
			log.info("Login Successfull");
			log.warn("This is a first warning");
		} else {
			log.error("This is a first error");
			log.fatal("This is a first warning");
			log.debug("This is a first warning");
		}

	}

}
