package package1;

import static org.testng.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Guru99Login 

{
	
	 WebDriver driver;

	    @FindBy(name="uid")

	    WebElement user99GuruName;

	    

	    @FindBy(name="password")

	    WebElement password99Guru;

	    

	    @FindBy(className="barone")

	    WebElement titleText;

	    @FindBy(name="btnLogin")

	    WebElement login;
	    @FindBy(xpath="//a [@href='addcustomerpage.php']")
	    WebElement Newcustomer;
	    @FindBy(xpath="//input [@name='name']")
	     WebElement CustomerName;
	    @FindBy(xpath="//input [@name='rad1'][1]")
	    WebElement Gendermale;
	    @FindBy(xpath="html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	    WebElement GenderFemale;
	    @FindBy(id="dob")
	   WebElement DateofBirth;
	    @FindBy(name="addr")
	    WebElement Address;
	     @FindBy(xpath="//input [@name='city']")
	    WebElement City;
	     @FindBy(name="state")
	     WebElement State;
	     @FindBy(name="pinno")
	     WebElement PIN;
	     @FindBy( name="telephoneno")
	     WebElement MobileNumber;
	     @FindBy( name="emailid")
	     WebElement Email;
	     @FindBy( name="password" )
	     WebElement Password;
	     @FindBy(xpath="//input [@value='Submit']")
	     WebElement Submit;
	     
	  @FindBy(xpath="//input [@value='Reset']")
	  WebElement Reset;
	  @FindBy(xpath="//p [@class='heading3']")
	  WebElement Toverifymessage;
	  String actual = "Customer Registered Successfully!!!";
	  
	    public Guru99Login(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver, this);

	    }

	    //Set user name in textbox

	    public void setUserName(String strUserName){

	        user99GuruName.sendKeys(strUserName);

	        

	    }

	    

	    //Set password in password textbox

	    public void setPassword(String strPassword){

	    password99Guru.sendKeys(strPassword);

	    }

	    

	    //Click on login button

	    public void clickLogin(){

	            login.click();

	    }

	    

	    //Get the title of Login Page

	    public String getLoginTitle(){

	     return    titleText.getText();

	    }

	    /**

	     * This POM method will be exposed in test case to login in the application

	     * @param strUserName

	     * @param strPasword

	     * @return

	     */

	    public void loginToGuru99(String strUserName,String strPasword){

	        //Fill user name

	        this.setUserName(strUserName);

	        //Fill password

	        this.setPassword(strPasword);

	        //Click Login button

	        this.clickLogin();

	                

	    }
//direct operation, withought using excel

	   /* public void AddNewCustomer()
	    {
	    	
	      Newcustomer.click();
	      CustomerName.sendKeys("nitu");
	
	      Gendermale.click();
	      DateofBirth.sendKeys("02-01-1992");
	      Address.sendKeys("electronic city");
	      City.sendKeys("bangalore");
	      State.sendKeys("karnataka");
	      PIN.sendKeys("560100");
	      MobileNumber.sendKeys("9900664716");
	      Email.sendKeys("mahananda.provab@gmail.com");
	      
	      Password.sendKeys("admin@123");
	      Submit.click();
	    //  String expectedresult=Toverifymessage.getText();
	//Assert.assertEquals(actual, expectedresult);
	 String message= driver.switchTo().alert().getText();
	      driver.switchTo().alert().accept();
	      System.out.println(message);
	      
}*/
	    


public void AddNewCustomer(String custname,String gendr,String dob,String addr,String city,String state, String pin,String mob,String email,String pwd)

{
	 Newcustomer.click();
     CustomerName.sendKeys(custname);

     Gendermale.click();
     DateofBirth.sendKeys(dob);
     Address.sendKeys(addr);
     City.sendKeys(city);
     State.sendKeys(state);
     PIN.sendKeys(pin);
     MobileNumber.sendKeys(mob);
     Email.sendKeys(email);
     
     Password.sendKeys(pwd);
     Submit.click();
   //  String expectedresult=Toverifymessage.getText();
//Assert.assertEquals(actual, expectedresult);
String message= driver.switchTo().alert().getText();
     driver.switchTo().alert().accept();
     System.out.println(message);
     
}}
