package test;

import org.testng.annotations.Test;

import pageobject.LoginPage;
import utilities.BaseClass;


public class LoginTest extends BaseClass{
  @Test
  public void login() {
		  LoginPage l = new LoginPage(driver); //aggregation
		  l.loginDetails();
  }
}
