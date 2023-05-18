package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	
	  @BeforeMethod
	  public void beforeClass() {
		  System.setProperty("webdriver.http.factory", "jdk-http-client");
		  System.setProperty("Webdriver.Chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Automation Testing\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://demosite.executeautomation.com/Login.html");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	  }

	  @AfterMethod
	  public void afterClass() {
		  //driver.close();
	  }
}
