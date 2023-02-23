package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	@FindBy(xpath="//input[@name='firstname']")private WebElement username;
	
	@FindBy(xpath="//input[@name='lastname']")private WebElement surname;
	
	@FindBy(xpath="//input[@name='reg_email__']")private WebElement mobileno;
	
	@FindBy(xpath="//input[@name='reg_passwd__")private WebElement regpassword;
	
	@FindBy(xpath="//select[@title='Day']")private WebElement BirthofDate;
	
	@FindBy(xpath="//select[@title='Month']")private WebElement MonthofDate;
	
	@FindBy(xpath="//select[@title='Year']")private WebElement YearofDate ;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")private WebElement Male;
	
	@FindBy(xpath="(//input[@name='sex'])[2]")private WebElement Female;
	
	@FindBy(xpath="(//input[@name='sex'])[3]")private WebElement Custom;
	
	@FindBy(xpath="(//a[@target='_blank'])[5]")private WebElement LearnMore;
	
	@FindBy(xpath="//a[@id='terms-link']")private WebElement termslink;
	
	@FindBy(xpath="//a[@id='privacy-link']")private WebElement privacylink;
	
	@FindBy(xpath="//a[@id='cookie-use-link']")private WebElement cookiespolicy;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")private WebElement signUpButton;

	
	
	
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}

	public void clickOnTermsLink() 
	{
		termslink.click();
		
	}

	public void clickOnPrivacyLink() 
	{
		privacylink.click();
		
	}

	
	public void clickOnCookiesPolicy() 
	{
		cookiespolicy.click();
		
	}
	
  
}

