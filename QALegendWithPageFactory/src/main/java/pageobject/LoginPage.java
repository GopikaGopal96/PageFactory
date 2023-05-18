package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	WebDriver driver;
	@CacheLookup
	@FindBy(name ="UserName")
	WebElement user;
	
	@CacheLookup
	@FindBy(name="Password")
	WebElement password;
	
	@CacheLookup
	@FindBy(name="Login")
	WebElement login;
	
	public void loginDetails() {
		//driver.navigate().refresh(); - StaleElementReference Exception
		  user.sendKeys("gopika");
		  password.sendKeys("12345");
		  login.submit();
	  }
	  public LoginPage(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
}
