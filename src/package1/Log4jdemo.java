package package1;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jdemo 
{

	public static void main(String[] args)
	{
		  WebDriver driver;
	 Logger log=Logger.getLogger("abc");
	 System.setProperty("webdriver.chrome.driver","D:\\eclipse\\jar\\chromedriver.exe");
	 log.info("system property set");
	 driver = new ChromeDriver();
	 
	  log.info("driver instance created");
	  
	  driver.get("https://www.google.co.in");
	  log.info("it is launched google page");

	}

}
