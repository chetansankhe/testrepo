package Test.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HelloWorld {
	WebDriver driver;

  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Class\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @Test
  public void Launch() {
	  driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");
	  driver.findElement(By.id("txtName")).sendKeys("Demo");
	  driver.findElement(By.id("txtEmail")).sendKeys("abc@gmail.com");
	  
			
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
