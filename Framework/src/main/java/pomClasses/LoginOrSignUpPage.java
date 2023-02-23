package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	
	//Variable : WebElement : Login Or Sign Page 
	
	@FindBy (xpath="//input[@type='text']") 
	private WebElement usernameAmazon;
	
	@FindBy (xpath="//input[@id='continue']") 
	private WebElement continueButton;
	
	//Constructor : Initialization of WebElement : create your amazon account
	
	public LoginOrSignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Method Action on WebElement : Login or Sign Page 
	
	public void sendEmailorPhoneNo() {
		
		usernameAmazon.sendKeys("7972396592");
		
	}
	
	public void clickContine() {
		continueButton.click();
		
	}
}
