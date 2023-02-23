package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Facebook.ForgotPassword;
import Facebook.LoginOrSignPage;

public class TestClass {

	public static void main(String[] args) 
	{
		System.out.println("Hello");
		
        System.setProperty("webdriver.chrome.driver","D:\\\\Automation testing Syllabus Copies\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver();
		
		driverTest.get("https://www.facebook.com");
		
		LoginOrSignPage loginOrSignPage = new LoginOrSignPage(driverTest);
		loginOrSignPage.emailOrPhoneNo();
		loginOrSignPage.password();
		loginOrSignPage.forgotpasswordButton();
		loginOrSignPage.createOnAccountButton();
		
		ForgotPassword forgotPassword = new ForgotPassword(driverTest);
		forgotPassword.emailOrMobileNo();
		forgotPassword.searchButton();
		forgotPassword.cancelButton();
		forgotPassword.forgotPassword();

	}

}
