package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gmaillogin2 {
		// TODO Auto-generated method stub
		static WebDriver driver;


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//(xpath="//div[@class='gmail-nav__nav-links-wrap']/a[2]']")
			//private WebElement Signin;
			//After finding element we are storing in signin
			
		//@Test
			//public void opengmail() throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver","D:\\eclipse\\jar\\chromedriver.exe");
				// TODO Auto-generated method stub
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com/gmail/about/#");
				driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();


		}

		}

	}


