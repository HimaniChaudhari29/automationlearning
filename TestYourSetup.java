package scripts;
//This is modified file in main branch
//It is of v1.0
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestYourSetup {

	WebDriver driver;
//It is testng annotation.It is untacked file while this comment wrote.
//Now it is staged file
	@Test
	public void loginToNicheThyselfTourism() {
		driver.get("https://nichethyself.com/tourism/home.html");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("stc123");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345");
		username.submit();
		String ExpectedPageTitleAfterLogin="My account";
		String ActualPageTitleAfterLogin=driver.getTitle();
		  assertEquals(ActualPageTitleAfterLogin,ExpectedPageTitleAfterLogin);
	}

	@BeforeMethod()
	public void beforeMethod() {
		driver = new ChromeDriver();
		// driver=new FirefoxDriver();
		driver.manage().window().maximize();

	}

}
