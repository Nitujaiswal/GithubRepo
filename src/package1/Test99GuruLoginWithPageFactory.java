package package1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GENrowcolumn.Genericclass;

public class Test99GuruLoginWithPageFactory 

{
	
	 WebDriver driver;

	    Guru99Login objLogin;
	    Guru99Home objHomePage;
	    Genericclass gen=new Genericclass();
	 
	   
	    @BeforeTest

	    public void setup(){

	        //driver = new FirefoxDriver();
	        System.setProperty("webdriver.chrome.driver","D:\\eclipse\\jar\\chromedriver.exe");
	    	
			driver=new ChromeDriver();

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("http://demo.guru99.com/V4/");

	    }

	    /**

	     * This test go to http://demo.guru99.com/V4/

	     * Verify login page title as guru99 bank

	     * Login to application

	     * Verify the home page using Dashboard message
	     * @throws IOException 
	     * @throws InvalidFormatException 
	     * @throws FileNotFoundException 
	     * @throws EncryptedDocumentException 

	     */

	    @Test(priority=0)

	    public void test_Home_Page_Appear_Correct() throws EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException{

	        //Create Login Page object

	    objLogin = new Guru99Login(driver);

	    //Verify login page title

	    String loginPageTitle = objLogin.getLoginTitle();

	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

	    //login to application
	    
	  String  un=gen.getExceldata("Sheet1",0, 0);

	  String  pass=gen.getExceldata("Sheet1",0, 1);
	    objLogin.loginToGuru99(un, pass);

	    // go the next page

	    objHomePage = new Guru99Home(driver);

	    //Verify home page

	    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));

	    }
	    
	   /* public void newcustomerReg()
	    {
	    	objLogin.AddNewCustomer();
	    }*/
	    @Test(priority=1)
	    public void newCustomerReg() throws EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException
	    {
	    	
	    	String  name=gen.getExceldata("Sheet1",2, 1);
	    	String  gender=gen.getExceldata("Sheet1",3, 1);
	    	String  dob=gen.getExceldata("Sheet1",4, 1);
	    	String  addr=gen.getExceldata("Sheet1",5, 1);
	    	
	    	String  city=gen.getExceldata("Sheet1",6, 1);
	    	String  state=gen.getExceldata("Sheet1",7, 1);
	    	String  pin=gen.getExceldata("Sheet1",8, 1);
	    	String  mob=gen.getExceldata("Sheet1",9, 1);
	    	
	    	String  email=gen.getExceldata("Sheet1",10, 1);
	    	String  pwd=gen.getExceldata("Sheet1",11, 1);
	    	
	    	objLogin.AddNewCustomer(name, gender, dob, addr, city, state, pin, mob, email, pwd);
	    }
}
