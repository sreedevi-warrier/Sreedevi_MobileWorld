package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class SignUpP {

	WebDriver driver;
    public SignUpP(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
@FindBy(xpath="//button[@type='submit']")
	WebElement signin;

@FindBy(xpath="//a[normalize-space()='Sign up']")
WebElement SignUp;

@FindBy(id="myName")
WebElement FirstName;

@FindBy(xpath="//input[@placeholder='Last Name']")
WebElement LastName;

@FindBy(xpath="//input[@placeholder='Enter Email']")
WebElement Email;

@FindBy(xpath="//input[@placeholder='Password']")
WebElement Password;

@FindBy(xpath="//input[@type='date']")
WebElement Date;

@FindBy(xpath="//div[@class='col-md-2']//input[@name='gender']")
WebElement Male;

@FindBy(xpath="//label[normalize-space()='Female']")
WebElement Female;

@FindBy(xpath="//input[@placeholder='91XXXXXXXXXX']")
WebElement MobileNumber;

@FindBy(xpath="//textarea[@placeholder='Short Bio']")
WebElement ShortBio;

@FindBy(xpath="//button[@type='submit']")
WebElement Register;

@FindBy(xpath="//button[@type='Submit']")
WebElement SignIn;

  public void goTo()
   {
	driver.get("https://mobileworld.banyanpro.com/");
   }
	public WebElement Signin()
	{ 
		return signin;
	}
	public WebElement signup()
	{
		return SignUp;
		
	}
	public WebElement Fname()
	{
		return FirstName;
	}
	public WebElement Lname()
	{
		return LastName;
	}
	public WebElement eml()
	{
		return Email;
	}
	public WebElement ppsd()
	{
		return Password;
	}
	public WebElement dob()
	{
		return Date;
	}
	public WebElement male()
	{
		return Male;
	}
	public WebElement female()
	{
		return Female;
	}
	
	public WebElement MN()
	{
		return MobileNumber;
	}
	public WebElement Shtbio()
	{ 
		return ShortBio;
	}
	public WebElement reg()
	{
		 return Register;
	}
    public WebElement si()
    {
    	 return SignIn;
    }
}
