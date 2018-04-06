package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmaillogin {
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='identifierId']")
	private WebElement email;
	
	@FindBy(xpath=".//*[@id='identifierNext']/content")
	private WebElement next;
	
	@FindBy(xpath=".//*[@id='password']/div[1]/div/div[1]/input")
	private WebElement pass;

	
	
	
	public Gmaillogin(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
	 
	public void login()
	{
		email.sendKeys("mahananda.provab@gmail.com");//this message need to send
		next.click();
		pass.sendKeys("Provab@2017");
		next.click();
	}
	

}
