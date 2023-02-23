package TestNg;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Facebook.LoginOrSignPage;
import Facebook.SignUpPage;

public class TestNgClass {
	
	WebDriver driver;
	LoginOrSignPage loginPage;
	SignUpPage signUpPage;
	
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		System.out.println(browserName);
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Automation testing Syllabus Copies\\Selenium\\VersionNew\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\FirefoxBrowser\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	@BeforeClass
	public void test()
	{
		System.out.println("Before Class");
		loginPage = new LoginOrSignPage(driver);
		signUpPage = new SignUpPage(driver);
		
	}
	
	@BeforeMethod
	public void goToSignUpForm()
	{
		driver.manage().deleteAllCookies();
        System.out.println("Before Method");
        driver.get("https://www.facebook.com/");
       // LoginPage loginPage = new LoginPage(driver);
        loginPage.createOnAccountButton();
	}
	
	@Test
	public void verifyPrivacyPolicyLink()
	{
		//SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.clickOnPrivacyLink();
		ArrayList<String> add = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(add.get(1));
		
		String privacyPolicytURL = driver.getCurrentUrl();
		if(privacyPolicytURL.equals("https://en-gb.facebook.com/privacy/policy/?entry_point=data_policy_redirect&entry=0"))
		{
			System.out.println("Privacy Test Pass");
		}
		else
		{
			System.out.println("Privacy Test Fail");
		}
		
		
	 }
	@Test
	public void verifytermsLink()
	{
		//SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.clickOnTermsLink();
		ArrayList<String> add = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(add.get(1));
		
		String termsURL = driver.getCurrentUrl();
		if(termsURL.equals("https://en-gb.facebook.com/legal/terms/update"))
		{
			System.out.println("Terms Test Pass");
		}
		else
		{
			System.out.println("Terms Test Fail");
		}
		
		
	 }
	@Test 
	public void verifycookiesPolicyLink()
	{
		//SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.clickOnCookiesPolicy();
		ArrayList<String> add = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(add.get(1));
		
		String cookiesPolicyURL = driver.getCurrentUrl();
		if(cookiesPolicyURL.equals("https://en-gb.facebook.com/privacy/policies/cookies/?entry_point=cookie_policy_redirect&entry=0"))
		{
			System.out.println("Cookies Test Pass");
		}
		else
		{
			System.out.println("Cookies Test Fail");
		}
		
		
	 }

	
	@AfterMethod
	public void closeChildBrowser()
	{
		driver.close();
		ArrayList<String> add = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(add.get(0));
		System.out.println("After Method");
		
	}
	
	@AfterClass
	public void clearPOMObject()
	{
		signUpPage = null;
		loginPage = null;
		System.out.println("After Class");
	}

	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver = null;
		System.out.println("After Test");
		System.gc(); //garbage collector
	}
	
}