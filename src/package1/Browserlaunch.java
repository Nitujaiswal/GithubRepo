package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class Browserlaunch {

	@Test
	
	public void precondition(){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\jar\\chromedriver.exe");
  WebDriver driver;
  driver = new ChromeDriver();
  driver.get("https://www.google.co.in");
	}

}
