package Scripts;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pom.SignInP;

public class SignInS {


   @Test(dataProvider="Signin")
    public void sign(String username,String Password) throws Exception
    {
    
		System.setProperty("webdriver.chrome.driver", "C:/Users/sreedevi.c/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
             
            SignInP page=new SignInP(driver);
            page.goTo();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            page.signinbutton().click();
            Thread.sleep(2000);
            page.uname().sendKeys(username);
            Thread.sleep(2000);
            page.pwd().sendKeys(Password);
            Thread.sleep(2000);
            page.loginbutton().click();
            driver.close();
        }
    @DataProvider(name="Signin")
    public Object[][] getdata()
    {
        Object [][] data=new Object[4][2];
      data [0][0]="Sreedevi";
      data [0][1]="qwerty";
      data [1][0]="Ss";
      data [1][1]="93434";
      data [2][0]="sreedevajkajdlajdajdaodjaodjaojd";
      data [2][1]="shre9880";
      data [3][0]="Sree&4%-";
      data [3][1]="A123456789";
      return data;
        
    }
}