package Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.LoginOrSignUpPage;
import pomClasses.Password;

public class AmazonClass {
	
		public static void main (String[] args) {
	    
	        System.setProperty("webdriver.chrome.driver","D:\\\\Automation testing Syllabus Copies\\\\Selenium\\\\chromedriver.exe");
			
			WebDriver driverTest = new ChromeDriver();
			driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driverTest.manage().window().maximize();
			
			driverTest.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
			
			LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driverTest);
			
			loginOrSignUpPage.sendEmailorPhoneNo();
			loginOrSignUpPage.clickContine();
			
			
			Password passwordAmazon = new Password(driverTest);
			passwordAmazon.clickContine();
			
		}

	}



