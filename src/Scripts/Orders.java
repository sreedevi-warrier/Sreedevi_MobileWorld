package Scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.homepageO;

public class Orders {

	@Test
	public void orders() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/sreedevi.c/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		homepageO Lgp = new homepageO(driver);
		Lgp.goTo();
		Lgp.OrderPage("Sree","CVJ","sree@gmail.com","hello123","1234567898","house","town","Tsr","12345","2","3");

}
}