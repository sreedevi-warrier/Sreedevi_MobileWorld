package Pom;
import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;



public class homepageO {
	WebDriver driver;
	public homepageO(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

public void goTo()
	{
		driver.get("https://mobileworld.banyanpro.com/");
		
	}
//orders
@FindBy(xpath="//body/nav[@id='navbar']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav mx-auto']/li[4]/a[1]")
WebElement support;

@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Order']")
WebElement Orders;

@FindBy(css ="body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)")
WebElement Firstname;

@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(2)")
WebElement Lastname;

@FindBy(id = "inputEmail")
WebElement Email;

@FindBy(id ="inputPassword")
WebElement Password;

@FindBy(xpath = "//div[normalize-space()='Gender']")
WebElement Gender;

@FindBy(xpath = "//input[@id='flexRadioDefault1']")
WebElement Male;

@FindBy(xpath = "//input[@id='flexRadioDefault2']")
WebElement Female;

@FindBy(css ="input[placeholder='00000000000']")
WebElement MobileNumber;

@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(4) > div:nth-child(1) > input:nth-child(2)")
WebElement Address1;

@FindBy(id = "address2")
WebElement Address2;

@FindBy(id = "inputCity")
WebElement City;

//@FindBy(id = "inputState")
//WebElement State;

@FindBy(xpath ="//select[@id='inputState']")
WebElement state;

@FindBy(xpath="//*[@id=\"inputState\"]/option[2]")
WebElement tamilnadu;

@FindBy(id = "inputZip")
WebElement Zip;

//@FindBy(xpath = "//legend[@class='col-form-label col-sm-2 pt-0']")
//WebElement Brand;

@FindBy(xpath = "//input[@rel='apple']")
WebElement Apple;

@FindBy(xpath = "//input[@rel='samsung']")
WebElement Samsung;

@FindBy(xpath = "//input[@rel='lenovo']")
WebElement Lenovo;

@FindBy(xpath = "//label[normalize-space()='Model']")
WebElement Model;

@FindBy(xpath = "//div[@class='samsung']//option[1]")
WebElement SamsungS21;

@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(6) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > select:nth-child(1) > option:nth-child(2)")
WebElement SamsungA13;

@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(6) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > select:nth-child(1) > option:nth-child(3)")
WebElement SamsungZFLip;

@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(6) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > select:nth-child(1) > option:nth-child(1)")
WebElement LenovoK13;

@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(6) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > select:nth-child(1) > option:nth-child(2)")
WebElement LenovoLegion;

@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(6) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > select:nth-child(1) > option:nth-child(3)")
WebElement Lenovoa8;

@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(6) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(3) > select:nth-child(1) > option:nth-child(1)")
WebElement AppleXs;

@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(6) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(3) > select:nth-child(1) > option:nth-child(2)")
WebElement  Apple13;

@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(6) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(3) > select:nth-child(1) > option:nth-child(3)")
WebElement Apple12;

@FindBy(xpath = "//input[@placeholder='no of mobiles']")
WebElement count;

@FindBy(xpath = "//select[@id='bought']")
WebElement bought;

@FindBy(xpath ="//input[@id='time']")
WebElement boughtno;

//@FindBy(xpath = "//input[@id='time']")
//WebElement times;

@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(10) > div:nth-child(2) > input:nth-child(1)")
WebElement Input1;

@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(11) > div:nth-child(2) > input:nth-child(1)")
WebElement Input2;

@FindBy(xpath = "//button[normalize-space()='Order Now']")
WebElement Order;

@FindBy(xpath ="//div[@id=\"exampleModal\"]/div/div/div[3]/a")
WebElement close;

public void OrderPage(String fname,String lname,String EmailId,String Psd,
		String mobile,String add1,String add2,String cityname,
		String zipcode,String Count,String Times) throws InterruptedException
{
	
   support.click();
   Orders.click();
    Set windows = driver.getWindowHandles();
   Iterator it = (Iterator) windows.iterator(); String parentId = (String) it.next(); String childId = (String) it.next(); driver.switchTo().window(childId);
   Firstname.sendKeys(fname);
   Lastname.sendKeys(lname);
   Email.sendKeys(EmailId);
   Password.sendKeys(Psd);
   Gender.click();
   Male.click();
   MobileNumber.sendKeys(mobile);
   Address1.sendKeys(add1);
   Address2.sendKeys(add2);
   City.sendKeys(cityname);
   state.click();
   tamilnadu.click();
   Zip.sendKeys(zipcode);
   Apple.click();
   Samsung.click();
   Model.click();
   Apple13.click();
   count.sendKeys(Count);
   bought.click();
   boughtno.sendKeys(Times);   
   Input1.click();
   Input2.click();
   Thread.sleep(2000);
   Order.click();
   close.click();
}
}





