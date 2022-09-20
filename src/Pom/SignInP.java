package Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInP {

        
        WebDriver driver;
        public SignInP(WebDriver driver)
        {
            this.driver=driver;
            PageFactory.initElements(driver, this);
        }
        
        @FindBy(xpath="//button[.='SIGN IN']")
        WebElement sign;
        @FindBy(xpath="//input[@id='username']")
        WebElement username;
        @FindBy(xpath="//input[@id='password']")
        WebElement password;
        @FindBy(xpath="//a[.='Log In']")
        WebElement logbutton;
        @FindBy(xpath="//a[normalize-space()='Sign up']")
        WebElement signInL;
        
        
        public void goTo()
        {
            driver.get("https://mobileworld.banyanpro.com/");
        }
        public WebElement signinbutton()
        {
            return sign;
        }
        public WebElement uname()
        {
            return username;
        }
        public  WebElement pwd()
        {
            return password;
        }
        public WebElement loginbutton()
        {
            return logbutton;
        }
        public WebElement signuplink() {
        	return signInL;
        }
       
    }


